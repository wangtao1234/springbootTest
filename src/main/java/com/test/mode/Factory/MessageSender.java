package com.test.mode.Factory;

/**
 * Created by admin on 2018/4/20.
 */
public class MessageSender implements Sender  {

    @Override
    public void send() {
        System.out.println("短信发送");
    }
}
