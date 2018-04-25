package com.test.mode.Bridge;

/**
 * Created by admin on 2018/4/25.
 * 桥接模式
 */
public class Client {
    public static void  main(String[] args){
        Engine engine = new Engine200();

        Engine engine2 = new Engine200();

        Car benz = new Benz(engine);

        Car bmw = new Bmw(engine2);

        benz.install();

        bmw.install();
    }
}
