package com.factory.pattern.singleton;

/**
 * Created by darlynn on 3/9/17.
 */

//way6: static inner class
public class Singleton5 {
    private final static class SingleHolder {
        private static final Singleton5 INSTANCE=new Singleton5();
        private SingleHolder() {}
    }
    private Singleton5() {}
    public static Singleton5 getInstance() {
        return SingleHolder.INSTANCE;
    }
}
