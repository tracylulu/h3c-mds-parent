package com.h3c.mds.utils;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.ResourceBundle;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;
import javax.mail.util.ByteArrayDataSource;

public class MailUtils {

	private static String from;
	private static String password;
	private static String smtp_host;

	static {
		ResourceBundle rb = ResourceBundle.getBundle("mail");
		from = rb.getString("mail.from.account");
		password = rb.getString("mail.from.password");
		smtp_host = rb.getString("mail.from.smtp.host");
	}

	public static boolean sendMail(String to, String subject) {
		List<String> tos = new ArrayList<>();
		tos.add(to);
		return sendMail(tos, subject, "");
	}

	public static boolean sendMail(List<String> tos, String subject) {
		return sendMail(tos, subject, "");
	}

	public static boolean sendMail(String to, String subject, String content) {
		List<String> tos = new ArrayList<>();
		tos.add(to);
		return sendMail(tos, subject, content);
	}
	
	public static boolean sendMail(String to, String subject, String content,String fileName,InputStream is) {
		List<String> tos = new ArrayList<>();
		tos.add(to);
		return sendMail(tos, subject, content , fileName, is);
	}

	public static boolean sendMail(List<String> tos, List<String> ccs, String subject, String content) {
		try {

			// 1.创建参数配置，用于连接邮件服务器的参数配置
			Properties props = new Properties(); // 参数配置
			props.setProperty("mail.transport.protocol", "smtp"); // 使用的协议（JavaMail规范要求）
			props.setProperty("mail.smtp.host", smtp_host); // 发件人的邮箱的 SMTP 服务器地址
			props.setProperty("mail.smtp.auth", "true"); // 需要请求认证
			// 使用JavaMail发送邮件的5个步骤
			// 1、创建session
			Session session = Session.getInstance(props);
			// 开启Session的debug模式，这样就可以查看到程序发送Email的运行状态
			session.setDebug(true);
			// 2、通过session得到transport对象
			Transport ts = session.getTransport();
			// 3、使用邮箱的用户名和密码连上邮件服务器，发送邮件时，发件人需要提交邮箱的用户名和密码给smtp服务器，用户名和密码都通过验证之后才能够正常发送邮件给收件人。
			ts.connect(from, password);
			// 4、创建邮件
			Message message = new MimeMessage(session);

			// 指明邮件的发件人
			message.setFrom(new InternetAddress(password, "研发基础数据平台"));

			// 指明邮件的收件人，现在发件人和收件人是一样的，那就是自己给自己发
			message.setFrom(new InternetAddress(from));
			for (String to : tos) {
				message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			}
			for (String cc : ccs) {
				message.addRecipient(Message.RecipientType.CC, new InternetAddress(cc));
			}

			message.setSubject(subject);
			message.addHeader("charset", "UTF-8");

			// 邮件的标题
			message.setSubject(subject);
			// 邮件的文本内容
			message.setContent(content, "text/html;charset=UTF-8");			
			
			// 返回创建好的邮件对象

			// 5、发送邮件
			ts.sendMessage(message, message.getAllRecipients());
			ts.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}
	
	public static boolean sendMail(List<String> tos, List<String> ccs, String subject, String content, String fileName,InputStream is) {
		try {

			// 1.创建参数配置，用于连接邮件服务器的参数配置
			Properties props = new Properties(); // 参数配置
			props.setProperty("mail.transport.protocol", "smtp"); // 使用的协议（JavaMail规范要求）
			props.setProperty("mail.smtp.host", smtp_host); // 发件人的邮箱的 SMTP 服务器地址
			props.setProperty("mail.smtp.auth", "true"); // 需要请求认证
			// 使用JavaMail发送邮件的5个步骤
			// 1、创建session
			Session session = Session.getInstance(props);
			// 开启Session的debug模式，这样就可以查看到程序发送Email的运行状态
			session.setDebug(true);
			// 2、通过session得到transport对象
			Transport ts = session.getTransport();
			// 3、使用邮箱的用户名和密码连上邮件服务器，发送邮件时，发件人需要提交邮箱的用户名和密码给smtp服务器，用户名和密码都通过验证之后才能够正常发送邮件给收件人。
			ts.connect(from, password);
			// 4、创建邮件
			Message message = new MimeMessage(session);

			// 指明邮件的发件人
			message.setFrom(new InternetAddress(password, "研发基础数据平台"));

			// 指明邮件的收件人，现在发件人和收件人是一样的，那就是自己给自己发
			message.setFrom(new InternetAddress(from));
			for (String to : tos) {
				message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			}
			for (String cc : ccs) {
				message.addRecipient(Message.RecipientType.CC, new InternetAddress(cc));
			}

			message.setSubject(subject);
			message.addHeader("charset", "UTF-8");

			// 邮件的标题
			message.setSubject(subject);
			// 邮件的文本内容
			//message.setContent(content, "text/html;charset=UTF-8");
			
			// 创建消息部分
            BodyPart messageBodyPart = new MimeBodyPart(); 
            // 消息
            messageBodyPart.setText(content);

            // 创建多重消息
            Multipart multipart = new MimeMultipart();
//            // 设置文本消息部分
//            multipart.addBodyPart(messageBodyPart);

            // 附件部分
            messageBodyPart = new MimeBodyPart();
            // 设置要发送附件的文件路径
            DataSource source = new ByteArrayDataSource(is, "application/msexcel");
            messageBodyPart.setDataHandler(new DataHandler(source));

            // messageBodyPart.setFileName(filename);
            // 处理附件名称中文（附带文件路径）乱码问题
            messageBodyPart.setFileName(MimeUtility.encodeText(fileName+".xlsx"));
            multipart.addBodyPart(messageBodyPart);

			// 返回创建好的邮件对象
            message.setContent(multipart);
            message.saveChanges();
			// 5、发送邮件
			ts.sendMessage(message, message.getAllRecipients());
			ts.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	public static boolean sendMail(List<String> tos, String subject, String content) {
		return sendMail(tos, new ArrayList<>(), subject, content);
	}
	
	public static boolean sendMail(List<String> tos, String subject, String content, String fileName,InputStream is) {
		return sendMail(tos, new ArrayList<>(), subject, content, fileName, is);
	}

	public String getMailList(String[] mailArray) {
		StringBuffer toList = new StringBuffer();
		int length = mailArray.length;
		if (mailArray != null && length < 2) {
			toList.append(mailArray[0]);
		} else {
			for (int i = 0; i < length; i++) {
				toList.append(mailArray[i]);
				if (i != (length - 1)) {
					toList.append(",");
				}

			}
		}
		return toList.toString();
	}

	public static void main(String[] args) throws Exception {
		List<String> tos = new ArrayList<>();
		tos.add("lkf7579@h3c.com");
		List<String> ccs = new ArrayList<>();
		ccs.add("lkf7579@h3c.com");
		//System.out.println(sendMail(tos, ccs, "hello", "world","C:\\Users\\lkf7579\\Desktop\\数据字典DD对照.xlsx"));
		//System.out.println(sendMail(tos, "hello2", "<a href='http://localhost:8080/flowable/productCode/edit/"+165+"'>打开链接</a>"));
	}

}
