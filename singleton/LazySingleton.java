package com.spring.batch.immutable.designpatterns.singleton;

public class LazySingleton {

    static LazySingleton instance;

    private LazySingleton(){

    }

    public static synchronized LazySingleton getInstance(){ //for multithreaded
        if (instance == null) {
            return instance = new LazySingleton(); //lazy loading only when its required
        }
        return instance;
    }
}
