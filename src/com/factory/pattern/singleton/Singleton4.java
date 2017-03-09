package com.factory.pattern.singleton;

//way5: lazy and safe , another type for Singleton3
public class Singleton4 {
    private static Singleton4 instance=null;
    static {
        instance = new Singleton4();
    }
    private Singleton4() {}

    public static Singleton4 getInstance() {
        return instance;
    }

}
