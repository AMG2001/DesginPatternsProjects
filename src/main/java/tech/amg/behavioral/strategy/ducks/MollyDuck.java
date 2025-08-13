package tech.amg.behavioral.strategy.ducks;

import tech.amg.behavioral.strategy.fly.FlyBehavior;
import tech.amg.behavioral.strategy.quack.QuackBehavior;

public class MollyDuck extends Duck{

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public MollyDuck(FlyBehavior flyBehavior, QuackBehavior quack) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quack;
    }

    @Override
    public void fly() {
        flyBehavior.fly();
    }

    @Override
    public void quack() {
        quackBehavior.quack();
    }
}
