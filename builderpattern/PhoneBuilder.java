package com.spring.batch.immutable.designpatterns.builderpattern;

public class PhoneBuilder {

    private String os;
    private double screenSize;
    private String processor;
    private double ram;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setRam(double ram) {
        this.ram = ram;
        return this;
    }

    public Phone getPhone(){
        return new Phone(os, screenSize, processor, ram);
    }
}
