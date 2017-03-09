package com.factory.pattern.singleton;

/**
 * Created by darlynn on 3/9/17.
 *
 *
 * Singleton Implement : 7 ways
 */

// way1: unlazy and unsafe
public class Singleton {
    private static Singleton instance=null;
    private Singleton(){

    }

    public static Singleton getInstance() {
        if (instance==null) {
            instance = new Singleton();
        }
        return instance;
    }
}

