package tech.amg.behavioral.strategy.fly;

public class CantFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Can't fly");
    }
}
