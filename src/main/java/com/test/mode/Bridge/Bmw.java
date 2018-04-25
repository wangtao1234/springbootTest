package com.test.mode.Bridge;

/**
 * Created by admin on 2018/4/25.
 */
public class Bmw extends Car {

    public Bmw(Engine engine) {
        super(engine);
    }

    @Override
    public void install() {
        this.getEngine().addEngine();
    }
}
