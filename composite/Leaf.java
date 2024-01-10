package com.spring.batch.immutable.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

interface Component {

    void showPrice();
}
public class Leaf implements Component {

    private String name;
    private Integer price;

    public Leaf(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showPrice() {
        System.out.println(name + " : " + price);
    }

}
class Composite implements Component{

    private String name;
    List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void showPrice() {
        System.out.println(name);
        for (Component component: components) {
            component.showPrice();
        }
    }

    public void addComponent(Component component) {
        this.components.add(component);
    }
}