package com.spring.batch.immutable.designpatterns.composite;

public class Computer {

    public static void main(String[] args) {
        Leaf hdd = new Leaf("HDD", 2000);
        Leaf sdd = new Leaf("SDD", 1000);
        Leaf videoCard = new Leaf("VideoCard", 2100);
        Leaf memoryCard = new Leaf("memoryCard", 3000);

        Composite internalComponent = new Composite("Internal component");
        Composite cabinet = new Composite("Cabinet");
        internalComponent.addComponent(hdd);
        internalComponent.addComponent(sdd);

        cabinet.addComponent(videoCard);
        cabinet.addComponent(memoryCard);
        Composite computer = new Composite("Computer");
        computer.addComponent(internalComponent);
        computer.addComponent(cabinet);

        computer.showPrice();
    }
}
