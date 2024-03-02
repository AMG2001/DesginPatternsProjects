package org.example.Implementors;

import org.example.Interfaces.Pizza;

public class ChikenPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing chicken pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking chicken pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting chicken pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing chicken pizza");
    }
}
