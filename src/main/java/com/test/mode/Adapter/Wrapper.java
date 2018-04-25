package com.test.mode.Adapter;

/**
 * Created by admin on 2018/4/23.
 * 对象适配器
 */
public class Wrapper implements Targetable {
    private Source source;

    public  Wrapper(Source source){
        this.source = source;
    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {
        source.method1();
    }
}
