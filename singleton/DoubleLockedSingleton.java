package com.spring.batch.immutable.designpatterns.singleton;

public class DoubleLockedSingleton {

    static DoubleLockedSingleton instance;

    private DoubleLockedSingleton(){

    }

    public static DoubleLockedSingleton getInstance() { //for multithreaded, when two threads access this method at the same time.
        if (instance == null) {
            synchronized (DoubleLockedSingleton.class) {
                if (instance == null) {
                    instance = new DoubleLockedSingleton(); //lazy loading only when its required
                }
            }
        }
        return instance;
    }
}
