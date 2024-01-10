package com.spring.batch.immutable.designpatterns.builderpattern;

public class Phone {

    private String os;
    private double screenSize;
    private String processor;
    private double ram;

    public Phone(String os, double screenSize, String processor, double ram) {
        this.os = os;
        this.screenSize = screenSize;
        this.processor = processor;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", screenSize=" + screenSize +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                '}';
    }
}

class Runner {
    public static void main(String[] args) {
        // similar to @Builder annotation
        Phone phone = new PhoneBuilder().setOs("Android").setProcessor("Qaulcomm").getPhone();
        System.out.println(phone);
    }
}
