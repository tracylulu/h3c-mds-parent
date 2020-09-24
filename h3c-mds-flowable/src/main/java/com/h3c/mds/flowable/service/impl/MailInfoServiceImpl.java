package com.h3c.mds.flowable.service.impl;

import com.h3c.mds.flowable.dao.MailInfoMapper;
import com.h3c.mds.flowable.entity.MailInfo;
import com.h3c.mds.flowable.entity.MailInfoExample;
import com.h3c.mds.flowable.entity.ProcessConfigItem;
import com.h3c.mds.flowable.executor.MailThreadExecutor;
import com.h3c.mds.flowable.service.MailInfoService;
import com.h3c.mds.flowable.service.ProcessConfigItemService;
import com.h3c.mds.sysmgr.entity.User;
import com.h3c.mds.sysmgr.service.UserService;
import com.h3c.mds.sysmgr.util.UserUtils;
import com.h3c.mds.utils.MailUtils;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class MailInfoServiceImpl implements MailInfoService {

    @Autowired
    private MailInfoMapper mailInfoMapper;
    @Autowired
    private UserService userService;
    @Autowired
    private ProcessConfigItemService processConfigItemService;
    @Value("${sso.main.url}")
    private String siteMainUrl;
    @Value("${defaultMail}")
    private String defaultMail;
    @Autowired
    private MailThreadExecutor executor;


    @Override
    @Transactional
    public void create(MailInfo mailInfo){
        //mailInfo.setStatus("1");
        mailInfo.setCreateDate(new Date());
        //mailInfo.setCreateUser(UserUtils.getCurrentUserId());
        mailInfo.setModifyDate(new Date());
       // mailInfo.setModifyUser(UserUtils.getCurrentUserId());
        mailInfoMapper.insertSelective(mailInfo);
    }

    /**
     * 发送邮件并保存记录 有抄送人
     * @param sendTo
     * @param ccTo
     * @param subject
     * @param content
     * @param processId
     */
    @Override
    @Transactional
    public void sendMailAndRecord(String sendTo, String ccTo, String subject, String content,Integer processId,String url,String moduleDesc,String taskId) {
        List<MailInfo> infoList = getByProcessIdAndTaskId(processId, taskId);
        if(CollectionUtils.isNotEmpty(infoList)){
            for(MailInfo mailInfo :infoList){
                mailInfo.setStatus("0");
                update(mailInfo);
            }
        }
        MailInfo mailInfo = new MailInfo();
        mailInfo.setSendTo(sendTo);
        mailInfo.setCcTo(ccTo);
        mailInfo.setSubject(subject);
        mailInfo.setContent(content);
        mailInfo.setProcessId(processId);
        mailInfo.setUrl(url);
        mailInfo.setModuleDesc(moduleDesc);
        mailInfo.setTaskId(taskId);
        mailInfo.setStatus("1");
        create(mailInfo);

        String[] sendArr = sendTo.split(",");
        if(ccTo != null){
            String[] ccArr = ccTo.split(",");

            sendMail(Arrays.asList(sendArr),Arrays.asList(ccArr),subject,content,mailInfo.getId());
        }else{
            sendMail(Arrays.asList(sendArr),null,subject,content,mailInfo.getId());
        }


    }

    /**
     * 发送邮件并保存记录  无抄送人
     * @param sendTo
     * @param subject
     * @param content
     * @param processId
     */
    @Override
    @Transactional
    public void sendMailAndRecord(String sendTo, String subject, String content,Integer processId,String url,String moduleDesc,String taskId) {
        sendMailAndRecord(sendTo, null, subject, content, processId,url,moduleDesc,taskId);
    }

    @Override
    @Transactional
    public MailInfo getById(Integer id) {
        return mailInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<MailInfo> getByStatus(String status) {
        MailInfoExample example = new MailInfoExample();
        MailInfoExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(status);
        example.setOrderByClause("SUBJECT");
        return mailInfoMapper.selectByExample(example);
    }

    @Override
    @Transactional(readOnly = true)
    public void sendMail(List<String> sendTo, List<String> ccTo, String subject, String content, Integer id){
        content = "文档链接：<a href='"+siteMainUrl+"/mailLogin?mailid="+id+"'>打开文档</a>";
        content += "<div>此邮件来自：基础数据平台http://ibds.h3c.com/。</br>" +
                "如有使用问题请联系管理员，请勿直接回信。 </div>";
        if("open".equals(defaultMail)){
            List<ProcessConfigItem> sendItems = processConfigItemService.getByConfigCode("defaultMailSendTo");
            List<ProcessConfigItem> ccItems = processConfigItemService.getByConfigCode("defaultMailCcTo");
            List<String> sendList = new ArrayList<>();
            List<String> ccList = new ArrayList<>();
            if(!CollectionUtils.isEmpty(sendItems)){
                for(ProcessConfigItem item : sendItems){
                    sendList.add(item.getContent()+"@h3c.com");
                }
            }
            if(!CollectionUtils.isEmpty(ccItems)){
                for(ProcessConfigItem item : ccItems){
                    ccList.add(item.getContent()+"@h3c.com");
                }
            }
            if(ccTo == null){
                sendList.addAll(ccList);
                send(sendList, new ArrayList<>(), subject, content);
            }else{
                send(sendList, ccList, subject, content);
            }
        }else{
            List<String> sendList = new ArrayList<>();
            List<String> ccList = new ArrayList<>();
            if(!CollectionUtils.isEmpty(sendTo)){
                for(String item : sendTo){
                    sendList.add(item+"@h3c.com");
                }
            }
            if(!CollectionUtils.isEmpty(ccTo)){
                for(String item : ccTo){
                    ccList.add(item+"@h3c.com");
                }
            }
            if(ccTo == null){
                send(sendList, new ArrayList<>(), subject, content);
            }else{
                send(sendList, ccList, subject, content);
            }
        }

    }

    @Override
    @Transactional
    public void update(MailInfo mailInfo) {
        mailInfo.setModifyDate(new Date());
        //mailInfo.setModifyUser((String) SecurityUtils.getSubject().getPrincipal());
        mailInfoMapper.updateByPrimaryKeySelective(mailInfo);
    }

    public List<MailInfo> getByProcessIdAndTaskId(Integer processId,String taskId){
        MailInfoExample example = new MailInfoExample();
        MailInfoExample.Criteria criteria = example.createCriteria();
        criteria.andProcessIdEqualTo(processId);
        criteria.andTaskIdEqualTo(taskId);
        criteria.andStatusEqualTo("1");
        return mailInfoMapper.selectByExample(example);
    }


    public void send(List<String> sendTo,List<String> ccTo,String subject, String content){
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                MailUtils.sendMail(sendTo,ccTo, subject, content);
//            }
//        }).start();
        executor.send(sendTo, ccTo, subject, content);

    }
    
    public void send(List<String> sendTo,List<String> ccTo,String subject, String content, String fileName,InputStream is){
//      new Thread(new Runnable() {
//          @Override
//          public void run() {
//              MailUtils.sendMail(sendTo,ccTo, subject, content);
//          }
//      }).start();
      executor.send(sendTo, ccTo, subject, content,fileName,is);

  }

    @Override
    @Transactional(readOnly = true)
    public void sendMail(String sendTo, String ccTo, String subject, String content){

        if("open".equals(defaultMail)){
            List<ProcessConfigItem> sendItems = processConfigItemService.getByConfigCode("defaultMailSendTo");
            List<ProcessConfigItem> ccItems = processConfigItemService.getByConfigCode("defaultMailCcTo");
            List<String> sendList = new ArrayList<>();
            List<String> ccList = new ArrayList<>();
            if(!CollectionUtils.isEmpty(sendItems)){
                for(ProcessConfigItem item : sendItems){
                    sendList.add(item.getContent()+"@h3c.com");
                }
            }
            if(!CollectionUtils.isEmpty(ccItems)){
                for(ProcessConfigItem item : ccItems){
                    ccList.add(item.getContent()+"@h3c.com");
                }
            }
            if(ccTo == null){
                sendList.addAll(ccList);
                send(sendList, new ArrayList<>(), subject, content);
            }else{
                send(sendList, ccList, subject, content);
            }
        }else{
            List<String> sendList = new ArrayList<>();
            List<String> ccList = new ArrayList<>();
            sendList.add(sendTo+"@h3c.com");
            if(StringUtils.isNotBlank(ccTo)){
                ccList.add(ccTo+"@h3c.com");
            }
            if(ccTo == null){
                send(sendList, new ArrayList<>(), subject, content);
            }else{
                send(sendList, ccList, subject, content);
            }
        }

    }

    @Override
    @Transactional
    public void sendEffectNotice(List<String> sendTo, List<String> ccTo, String subject, String url,String moduleDesc){
        MailInfo mailInfo = new MailInfo();
        mailInfo.setSubject(subject);
        mailInfo.setUrl(url);
        mailInfo.setModuleDesc(moduleDesc);
        mailInfo.setStatus("0");
        create(mailInfo);
        String content;
        content = "文档链接：<a href='"+siteMainUrl+"/mailLogin?mailid="+mailInfo.getId()+"'>打开文档</a>";
        content += "<div>此邮件来自：基础数据平台http://ibds.h3c.com/。</br>" +
                "如有使用问题请联系管理员，请勿直接回信。 </div>";
        if("open11".equals(defaultMail)){
            List<ProcessConfigItem> sendItems = processConfigItemService.getByConfigCode("defaultMailSendTo");
            List<ProcessConfigItem> ccItems = processConfigItemService.getByConfigCode("defaultMailCcTo");
            List<String> sendList = new ArrayList<>();
            List<String> ccList = new ArrayList<>();
            if(!CollectionUtils.isEmpty(sendItems)){
                for(ProcessConfigItem item : sendItems){
                    sendList.add(item.getContent()+"@h3c.com");
                }
            }
            if(!CollectionUtils.isEmpty(ccItems)){
                for(ProcessConfigItem item : ccItems){
                    ccList.add(item.getContent()+"@h3c.com");
                }
            }
            if(ccTo == null){
                sendList.addAll(ccList);
                send(sendList, new ArrayList<>(), subject, content);
            }else{
                send(sendList, ccList, subject, content);
            }
        }else{
            List<String> sendList = new ArrayList<>();
            List<String> ccList = new ArrayList<>();
            if(!CollectionUtils.isEmpty(sendTo)){
                for(String item : sendTo){
                    sendList.add(item);
                }
            }
            if(!CollectionUtils.isEmpty(ccTo)){
                for(String item : ccTo){
                    ccList.add(item);
                }
            }
            if(ccTo == null){
                send(sendList, new ArrayList<>(), subject, content);
            }else{
                send(sendList, ccList, subject, content);
            }
        }

    }
    
    @Override
    @Transactional(readOnly = true)
    public void sendMail(String sendTo, String ccTo, String subject, String content, String fileName,InputStream is){

        if("open".equals(defaultMail)){
            List<ProcessConfigItem> sendItems = processConfigItemService.getByConfigCode("defaultMailSendTo");
            List<ProcessConfigItem> ccItems = processConfigItemService.getByConfigCode("defaultMailCcTo");
            List<String> sendList = new ArrayList<>();
            List<String> ccList = new ArrayList<>();
            if(!CollectionUtils.isEmpty(sendItems)){
                for(ProcessConfigItem item : sendItems){
                    sendList.add(item.getContent()+"@h3c.com");
                }
            }
            if(!CollectionUtils.isEmpty(ccItems)){
                for(ProcessConfigItem item : ccItems){
                    ccList.add(item.getContent()+"@h3c.com");
                }
            }
            if(ccTo == null){
                sendList.addAll(ccList);
                send(sendList, new ArrayList<>(), subject, content,fileName,is);
            }else{
                send(sendList, ccList, subject, content,fileName,is);
            }
        }else{
            List<String> sendList = new ArrayList<>();
            List<String> ccList = new ArrayList<>();
            sendList.add(sendTo+"@h3c.com");
            if(StringUtils.isNotBlank(ccTo)){
                ccList.add(ccTo+"@h3c.com");
            }
            if(ccTo == null){
                send(sendList, new ArrayList<>(), subject, content,fileName,is);
            }else{
                send(sendList, ccList, subject, content,fileName,is);
            }
        }

    }

}
