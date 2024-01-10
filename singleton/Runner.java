package com.spring.batch.immutable.designpatterns.singleton;

public class Runner {

    public static void main(String[] args) {
        DoubleLockedSingleton instance = DoubleLockedSingleton.getInstance();
        System.out.println(instance.hashCode());
        DoubleLockedSingleton instance1 = DoubleLockedSingleton.getInstance();
        System.out.println(instance1.hashCode());
    }
}
