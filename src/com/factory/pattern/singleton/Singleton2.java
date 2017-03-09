package com.factory.pattern.singleton;

/**
 * Created by darlynn on 3/9/17.
 */

//way3 : unlazy and safe , double check lock
public class Singleton2 {

    private volatile static Singleton2 instance=null;
    private Singleton2(){}

    public static Singleton2 getInstance() {
        if (instance==null) {
            synchronized (Singleton2.class) {
                instance = new Singleton2();
            }
        }
        return instance;
    }
}
