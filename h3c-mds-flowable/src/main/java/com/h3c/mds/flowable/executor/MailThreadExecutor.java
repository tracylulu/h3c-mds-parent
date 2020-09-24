package com.h3c.mds.flowable.executor;

import com.h3c.mds.utils.MailUtils;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.List;

@Component
public class MailThreadExecutor {

    @Async("mailExecutor")
    public void send(List<String> sendTo, List<String> ccTo, String subject, String content){
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                MailUtils.sendMail(sendTo,ccTo, subject, content);
//            }
//        }).start();
        System.out.println(Thread.currentThread().getName());
        MailUtils.sendMail(sendTo,ccTo, subject, content);
    }
    
    @Async("mailExecutor")
    public void send(List<String> sendTo, List<String> ccTo, String subject, String content, String fileName,InputStream is){
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                MailUtils.sendMail(sendTo,ccTo, subject, content);
//            }
//        }).start();
        System.out.println(Thread.currentThread().getName());
        MailUtils.sendMail(sendTo,ccTo, subject, content,fileName,is);
    }
}
