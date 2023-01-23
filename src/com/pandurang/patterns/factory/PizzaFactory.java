package com.pandurang.patterns.factory;

public class PizzaFactory {
    public static Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type == "Cheese") {
            pizza = new CheesePizza();
        } else if (type == "Chicken") {
            pizza = new ChickenPizza();
        } else if (type == "Veggie") {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
