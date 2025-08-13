package tech.amg.behavioral.strategy.quack;

public class MollyQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Molly Quack");
    }
}
