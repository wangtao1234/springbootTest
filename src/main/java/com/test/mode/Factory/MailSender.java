package com.test.mode.Factory;

/**
 * Created by admin on 2018/4/20.
 */
public class MailSender implements Sender {

    @Override
    public void send() {
        System.out.println(" 邮件发送");
    }
}
