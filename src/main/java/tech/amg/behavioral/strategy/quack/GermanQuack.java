package tech.amg.behavioral.strategy.quack;

public class GermanQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("German Quack");
    }
}
