package org.example.Implementors;

import org.example.Interfaces.Pizza;

public class MeatPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing meat pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking meat pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting meat pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing meat pizza");
    }
}
