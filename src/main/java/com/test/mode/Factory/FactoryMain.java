package com.test.mode.Factory;

import java.io.OutputStream;

/**
 * Created by admin on 2018/4/20.
 */
public class FactoryMain {

    public static void main(String[] args) {
        SenderFactory senderFactory = new SenderFactory();
        Sender sender = senderFactory.produce("mail");
        sender.send();
    }
}
