package com.test.mode.Factory;

/**
 * Created by admin on 2018/4/20.
 */
public class SenderFactory {
    public Sender produce(String type){



//        if("mail".equals(type)){
//            return  new MailSender();
//        }else if("sms".equals(type)){
//            return  new MessageSender();
//        }else
            return null;

        }
    public static Sender produceMail(){
        return  new MailSender();
    }

    public static Sender produceSms(){
        return new MessageSender();
    }


    }
