package com.spring.batch.immutable.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subscriber {

    private String name;
    private Channel channel;
    private List<Channel> subscriptionList;

    public Subscriber(String name, Channel channel, List<Channel> subscriptionList) {
        this.name = name;
        this.channel = channel;
        this.subscriptionList = subscriptionList;
    }

    public static  Subscriber createSubscriber(String name) {
        return new Subscriber(name, null, new ArrayList<>());
    }

    public void update(String title, String channelName, Channel channel){
        System.out.println("Hi " + name + " " + channelName + " owned by " + channel.getOwnerName() + " uploaded a video :" + title);
    }
    public void subscribeChannel(Channel channel) {
        subscriptionList.add(channel);
    }

    public void unSubscribeChannel(Channel channel) {
        subscriptionList.remove(channel);
    }

    public Channel createChannel(String name){
        return this.channel = new Channel(name, this);
    }

    public String getName() {
        return name;
    }
}
