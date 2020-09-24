package com.h3c.mds.flowable.service;

import com.h3c.mds.flowable.entity.MailInfo;
import org.springframework.transaction.annotation.Transactional;

import java.io.InputStream;
import java.util.List;

public interface MailInfoService {
    void create(MailInfo mailInfo);

    void sendMailAndRecord(String sendTo, String ccTo, String subject, String content,Integer processId,String url,String moduleDesc,String taskId);

    /**
     * 发送邮件并记录
     * @param sendTo    发送目标人
     * @param subject   主题
     * @param content
     * @param processId 流程主键
     * @param url   编辑页面url
     * @param moduleDesc    所属模块描述
     * @param taskId    任务id
     */
    @Transactional
    void sendMailAndRecord(String sendTo, String subject, String content, Integer processId,String url,String moduleDesc,String taskId);


    @Transactional
    MailInfo getById(Integer id);

    /**
     * 根据状态获取邮件信息集合
     * @param status    状态  1 为 需要发送    0未不发送
     * @return
     */
    List<MailInfo> getByStatus(String status);

    void sendMail(List<String> sendTo, List<String> ccTo, String subject, String content, Integer id);

    /**
     * 更新邮件信息
     * @param mailInfo
     */
    void update(MailInfo mailInfo);

    @Transactional(readOnly = true)
    void sendMail(String sendTo, String ccTo, String subject, String content);

    @Transactional(readOnly = true)
    void sendEffectNotice(List<String> sendTo, List<String> ccTo, String subject, String url,String moduleDesc);
    
    public void sendMail(String sendTo, String ccTo, String subject, String content, String fileName,InputStream is);
}
