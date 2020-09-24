package com.h3c.mds.task.config;

import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.PersistJobDataAfterExecution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

import com.h3c.mds.dept.service.CoaMailService;
import com.h3c.mds.dept.service.DeptDataService;
import com.h3c.mds.utils.HttpClientUtil;

import net.sf.json.util.JSONUtils;

/**
 * 从中台同步 部门组织架构数据
 * @author C17740
 *
 */
//@PersistJobDataAfterExecution//持久化
//@DisallowConcurrentExecution//禁止并发执行(Quartz不要并发地执行同一个job定义（这里指一个job类的多个实例）)
@Component
//@Configuration      //1.主要用于标记配置类，兼备Component的效果。
@EnableScheduling   // 2.开启定时任务
public class DeptQuartzJobBean {

	@Autowired
	DeptDataService deptDataService;
	
	@Autowired
	CoaMailService mailService;
	
	@Value("${spring.imageAPI.loginUrl}")
	private String eosAPI_loginUrl;
	
	@Value("${spring.deptAPI.httpUrl}")
	private String deptAPI_httpUrl;
	
	@Value("${spring.imageAPI.account}")
	private String eosAPI_account;
	
	@Value("${spring.imageAPI.password}")
	private String eosAPI_password;
	
	
	private Logger logger = LoggerFactory.getLogger(DeptQuartzJobBean.class);
	
	//@Override
	@Scheduled(cron ="${eos.dept.cron}")
	protected void executeTask() {
				
		logger.info("DeptQuartzJobBean job start");
		String deptData =null;
		try {
//			1.调用中台接口，获取token
//			2.拿token 调用组织架构数据接口
			deptData = new HttpClientUtil().getDataPost(eosAPI_loginUrl,eosAPI_account,eosAPI_password, deptAPI_httpUrl);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		3.如果架构数据非空，调用server 更新组织架构数据（一个事务），清表、全量同步数据.(包含组织架构和过滤研发外协的组织架构)
		if(deptData!=null && deptData.length()!=0) {
			
			JSONObject result=new JSONObject(deptData) ;
			int code = Integer.parseInt(result.get("code").toString());
			if(code==20216) {
				List<Map> deptDataList = (List<Map>)result.toMap().get("data");
				deptDataService.renewDeptDataTemp(deptDataList);
				logger.info("部门组织架构数据临时表IBDS_Dept已更新");
				deptDataService.renewDeptData();
				logger.info("部门组织架构数据表IBDS_Dept_Data已更新");
			}
			else {
				logger.info("接口："+deptAPI_httpUrl+"连接失败");
			}
//			JSONArray datas = new JSONArray(result.get("data").toString());
//			
//			for (Object object : datas) {
//				JSONObject obj = (JSONObject) object;
//				System.out.println("no. ===   " + obj.toMap());
//			}
		}
		else {
			logger.info("接口：:"+deptAPI_httpUrl+"异常，无数据");	
		}
//		4.更新部门角色信息表（新增的部门，对表中数据进行初始化）
		deptDataService.insertDeptMgn();
//	    5.新增一级部门情况，发送邮件给接口人（应该从视图中获取部门接口人非空的情况）
		mailService.sendMailForP04();
		logger.info("DeptQuartzJobBean job end");
		
	}

}
