package me.ele.napos.sendEmail;

/**
 * Created by jakoo on 21/04/2017.
 */
public class Main {
    public static void main(String[] args) {
        //这个类主要是设置邮件
        MailSenderInfo mailInfo = new MailSenderInfo();
        mailInfo.setMailServerHost("smtp.163.com");
        mailInfo.setMailServerPort("25");
        mailInfo.setValidate(true);
        mailInfo.setUserName("1234567@163.com");
        mailInfo.setPassword("********");//您的邮箱授权码
        mailInfo.setFromAddress("1234567@163.com");
        mailInfo.setToAddress("7654321@qq.com");
        mailInfo.setSubject("设置邮箱标题 Java Mail Test");
        mailInfo.setContent("设置邮箱内容 这是一个javax Mail测试");
        //这个类主要来发送邮件
        SimpleMailSender sms = new SimpleMailSender();
        sms.sendTextMail(mailInfo);//发送文体格式
        //sms.sendHtmlMail(mailInfo);//发送html格式
    }
}
