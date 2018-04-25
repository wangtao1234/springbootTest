package com.test.mode.proxy;

/**
 * Created by admin on 2018/4/25.
 */
public class CoderProxy implements Icoder {
    private  Icoder icoder;

    public CoderProxy(Icoder icoder){
        this.icoder = icoder;
    }

    @Override
    public void implDemands(String demandName) {
        icoder.implDemands(demandName);
    }
}
