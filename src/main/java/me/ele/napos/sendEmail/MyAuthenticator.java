package me.ele.napos.sendEmail;


import java.net.Authenticator;
import java.net.PasswordAuthentication;

/**
 * Created by jakoo on 21/04/2017.
 */
public class MyAuthenticator extends Authenticator{
    String userName = null;
    String password = null;

    public MyAuthenticator() {
    }

    public MyAuthenticator(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(userName,password);
    }
}
