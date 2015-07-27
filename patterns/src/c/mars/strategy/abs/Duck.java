package c.mars.strategy.abs;

/**
 * Created by Constantine Mars on 7/27/15.
 */
public abstract class Duck {
    protected QuackBehavior quackBehavior;
    protected FlyBehavior flyBehavior;

    protected Duck(){}
    public abstract void display();

    public void quack(){
        quackBehavior.quack();
    }

    public void fly(){
        flyBehavior.fly();
    }

    public void swim(){
        System.out.println("swimming");
    }
}
