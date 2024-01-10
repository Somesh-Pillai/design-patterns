package com.spring.batch.immutable.designpatterns.singleton;

public class EagerSingleton {

    static EagerSingleton instance = new EagerSingleton(); //loads in class loading

    private EagerSingleton(){

    }

    public static EagerSingleton getInstance(){
        return instance;
    }
}
