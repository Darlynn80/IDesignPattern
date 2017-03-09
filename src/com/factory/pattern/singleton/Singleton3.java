package com.factory.pattern.singleton;

/**
 * Created by darlynn on 3/9/17.
 */
//way4 : lazy and safe
public class Singleton3 {
    private static final Singleton3 INSTANCE=new Singleton3();
    private Singleton3() {}

    public static Singleton3 getInstance() {
        return INSTANCE;
    }
}

