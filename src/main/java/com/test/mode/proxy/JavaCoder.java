package com.test.mode.proxy;

/**
 * Created by admin on 2018/4/23.
 */
public class JavaCoder implements  Icoder {
    private String name;

    public JavaCoder(String name){
        this.name = name;
    }

    @Override
    public void implDemands(String demandName) {
        System.out.println(name + " implemented demand:" + demandName + " in JAVA!");
    }
}
