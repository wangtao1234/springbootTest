package com.test.mode.Decorator;

/**
 * Created by admin on 2018/4/23.
 */
public class Decorator implements Sourceable {

    private Sourceable source;

    public Decorator(Sourceable source){
        super();
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("before decorator");
        source.method();
        System.out.println("after decorator");
    }
}
