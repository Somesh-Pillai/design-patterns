package com.spring.batch.immutable.designpatterns.observer;

public class Youtube {

    public static void main(String[] args) {
        Subscriber somesh = Subscriber.createSubscriber("Somesh");
        Channel hunger_strikes = somesh.createChannel("Hunger Strikes");

        Subscriber swathi = Subscriber.createSubscriber("Swathi");
        Subscriber rahul = Subscriber.createSubscriber("Rahul");
        Subscriber manu = Subscriber.createSubscriber("Manu");
        Subscriber pranav = Subscriber.createSubscriber("Pranav");

        hunger_strikes.subscribe(swathi);
        hunger_strikes.subscribe(rahul);
        hunger_strikes.subscribe(manu);
        hunger_strikes.subscribe(pranav);

        swathi.subscribeChannel(hunger_strikes);
        rahul.subscribeChannel(hunger_strikes);
        manu.subscribeChannel(hunger_strikes);
        pranav.subscribeChannel(hunger_strikes);

        hunger_strikes.createVideo("How to code properly!");

    }
}
