package com.h3c.mds.task.config;

import java.util.*;

import com.h3c.mds.flowable.entity.MailInfo;
import com.h3c.mds.flowable.entity.PartCodeProcess;
import com.h3c.mds.flowable.service.MailInfoService;
import com.h3c.mds.flowable.service.PartCodeProcessService;
import com.h3c.mds.flowable.util.SpringContextUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.flowable.engine.TaskService;
import org.flowable.task.api.Task;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.PersistJobDataAfterExecution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;


/**
 * 邮催  
 * @author l20095
 *
 */
@PersistJobDataAfterExecution//持久化
@DisallowConcurrentExecution//禁止并发执行(Quartz不要并发地执行同一个job定义（这里指一个job类的多个实例）)
@Component
public class MailQuartzJobBean extends QuartzJobBean{

	
	
	private Logger LOG = LoggerFactory.getLogger(MailQuartzJobBean.class);

	
	@Override
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {
		LOG.info("定时任务开始执行--------");
		TaskService taskService = (TaskService) SpringContextUtils.getBean(TaskService.class);
		MailInfoService mailInfoService = (MailInfoService) SpringContextUtils.getBean(MailInfoService.class);
		List<MailInfo> mailInfoList = mailInfoService.getByStatus("1");
		List<MailInfo> sendList = new ArrayList<>();
		if(!CollectionUtils.isEmpty(mailInfoList)){
			for(MailInfo mailInfo : mailInfoList){
				//当前系统时间-邮件创建时间 大于 24小时
				if((System.currentTimeMillis()-mailInfo.getCreateDate().getTime())>3600*24*1000){
					if(StringUtils.equals("PART_DRAFT", mailInfo.getTaskId())){
						PartCodeProcessService partCodeProcessService = (PartCodeProcessService) SpringContextUtils.getBean(PartCodeProcessService.class);
						PartCodeProcess process = partCodeProcessService.getById(mailInfo.getProcessId());
						if(process != null && StringUtils.isBlank(process.getStatusDesc()) && StringUtils.equals("0", process.getStatus())){
							sendList.add(mailInfo);
						}else{
							mailInfo.setStatus("0");
							mailInfoService.update(mailInfo);
						}
					}else{
						Task task = taskService.createTaskQuery().taskId(mailInfo.getTaskId()).singleResult();
						if(task != null){
							sendList.add(mailInfo);
						}else{
							mailInfo.setStatus("0");
							mailInfoService.update(mailInfo);
						}
					}

				}
			}
			if(CollectionUtils.isNotEmpty(sendList)){
				sendMail(sendList);
			}
		}
	}

	private void sendMail(List<MailInfo> sendList) {
		if(CollectionUtils.isNotEmpty(sendList)){
			String siteMainUrl = ((Environment)SpringContextUtils.getBean(Environment.class)).getProperty("sso.main.url");
			Map<String,List> sendMap = new HashMap<>();
			for(MailInfo mailInfo : sendList){
				String sendTo = mailInfo.getSendTo();
				if(StringUtils.isNotBlank(sendTo)){
					String[] split = sendTo.split(",");
					if(split != null && split.length>0){
						for(String sp : split){
							if(StringUtils.isNotBlank(sp)){

								String content = "<div>超时文档："+mailInfo.getSubject()+"</div>";
								content += "<div>文档链接：<a href='"+siteMainUrl+"/mailLogin?mailid="+mailInfo.getId()+"'>打开文档</a></div></br>";
								if(sendMap.containsKey(sp)){
									List list = sendMap.get(sp);
									list.add(content);
								}else{
									List list = new ArrayList();
									list.add(content);
									sendMap.put(sp, list);
								}
							}
						}
					}
				}
			}
			Set<String> set = sendMap.keySet();
			if(CollectionUtils.isNotEmpty(set)){
				for(String key : set){
					String subject = "您有 "+sendMap.get(key).size()+" 个超时文档待处理,请及时处理。";
					List<String> list = sendMap.get(key);
					StringBuilder stringBuilder = new StringBuilder();
					for(String content : list){
						stringBuilder.append(content);
					}
					stringBuilder.append("<div>此邮件来自：基础数据平台http://ibds.h3c.com/。</br>" +
							"如有使用问题请联系管理员，请勿直接回信。 </div>");
					MailInfoService mailInfoService = (MailInfoService) SpringContextUtils.getBean(MailInfoService.class);
					mailInfoService.sendMail(key, null, subject, stringBuilder.toString());
				}
			}
		}
	}


	public void testContent() throws JobExecutionException {
		executeInternal(null);
	}


}
