package com.spring.batch.immutable.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {

    private String channelName;
    private Subscriber owner;
    private String title;
    private List<Subscriber> subscribers = new ArrayList<>();

    public Channel(String channelName, Subscriber owner) {
        this.channelName = channelName;
        this.owner = owner;
    }

    public void notifySubscribers(){
        for (Subscriber subscriber: subscribers) {
            subscriber.update(title, channelName, this);
        }
    }

    public void createVideo(String title) {
        this.title = title;
        notifySubscribers();
    }

    public void subscribe(Subscriber sub) {
        subscribers.add(sub);
    }

    public void unSubscribeChannel(Subscriber sub) {
        subscribers.remove(sub);
    }

    public String getOwnerName() {
        return this.owner.getName();
    }
}
