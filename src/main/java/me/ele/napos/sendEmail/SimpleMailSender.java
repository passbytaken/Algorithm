/*
package me.ele.napos.sendEmail;

import com.sun.xml.internal.org.jvnet.mimepull.MIMEMessage;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;
import java.util.Date;
import java.util.Properties;

*/
/**
 * Created by jakoo on 21/04/2017.
 * 
 *//*

public class SimpleMailSender {

    public boolean sendTextMail(MailSenderInfo mailInfo) {
        MyAuthenticator authenticator = null;
        Properties pro = mailInfo.getProperties();


        if (mailInfo.isValidate()) {
            authenticator = new MyAuthenticator(mailInfo.getUserName(), mailInfo.getPassword());
        }

        Session sendMailSession = Session.getDefaultInstance(pro.authenticator);

        //
        try {
            Message mailMessage = new MIMEMessage(sendMailSession);

            Address from = new InternetAddress(mailInfo.getFromAddress());

            mailMessage.setFrom(from);

            Address to = new InternatAddress(mailInfo.getToAddress());

            mailMessage.setRecipient(Message.RecipientType.TO,to);
            // 设置邮件消息的主题
            mailMessage.setSubject(mailInfo.getSubject());
            // 设置邮件消息发送的时间
            mailMessage.setSentDate(new Date());
            // MiniMultipart类是一个容器类，包含MimeBodyPart类型的对象
            Multipart mainPart = new MimeMultipart();
            // 创建一个包含HTML内容的MimeBodyPart
            BodyPart html = new MimeBodyPart();
            // 设置HTML内容
            html.setContent(mailInfo.getContent(), "text/html; charset=utf-8");
            mainPart.addBodyPart(html);
            // 将MiniMultipart对象设置为邮件内容
            mailMessage.setContent(mainPart);
            // 发送邮件
            Transport.send(mailMessage);
            return true;
        } catch (MessageingException e) {
            e.printStackTrace();
        }
        return false;

    }
}
*/
