package tech.amg.behavioral.strategy;

import tech.amg.behavioral.strategy.ducks.MollyDuck;
import tech.amg.behavioral.strategy.fly.FlyWIthWings;
import tech.amg.behavioral.strategy.quack.MollyQuack;

public class Main {
    public static void main(String[] args) {
        MollyDuck mollyDuck = new MollyDuck(new FlyWIthWings(),new MollyQuack());
        mollyDuck.fly();
        mollyDuck.quack();
    }
}
