package org.example.Implementors;

import org.example.Interfaces.Pizza;

public class PizzaFactory {
    public Pizza createPizza(String type) {
        if (type.toLowerCase().equals("meat")) {
            return new MeatPizza();
        } else if (type.toLowerCase().equals("cheese")) {
            return new CheesePizza();
        } else if (type.toLowerCase().equals("chicken")) {
            return new ChikenPizza();
        }
        return null;
    }
}
