package com.test;

/**
 * Created by admin on 2018/4/10.
 */
public class Test {
    static String key = "12432f***& [dfsafds]:[fdsafdsa] ";
    public static void main(String[] args){
        String aa = "124";
        String bb = "bbbbbb";
        System.out.println(getKey(aa,bb));
    }

    public static  String getKey(String...strings){
        String ret = new String(key);
        for(String s:strings){
            ret = ret.replaceFirst("\\[[a-zA-Z]*\\]",s);
        }
        return ret;
    }
}
