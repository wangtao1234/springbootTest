package com.test.mode.Bridge;

/**
 * Created by admin on 2018/4/25.
 */
public class Benz extends  Car {

    public Benz(Engine engine) {
        super(engine);
    }

    @Override
    public void install() {
        System.out.println("Benz车安装");
        this.getEngine().addEngine();
    }
}
