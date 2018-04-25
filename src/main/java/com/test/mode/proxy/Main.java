package com.test.mode.proxy;

/**
 * Created by admin on 2018/4/25.
 */
public class Main {
    public static  void  main(String[] args){
        Icoder icoder = new JavaCoder("李");
        Icoder icoderproxy = new CoderProxy(icoder);
        icoderproxy.implDemands("wang");
    }
}
