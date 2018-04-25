package com.test.mode.Adapter;

/**
 * Created by admin on 2018/4/23.
 */
public class Main {
    public  static void main(String[] args){
        Targetable targetable = new TargetImpl();
        targetable.method1();
    }
}
