package c.mars.strategy.imp;

import c.mars.strategy.abs.Duck;

/**
 * Created by Constantine Mars on 7/27/15.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior=new Quack();
        flyBehavior=new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm "+getClass().getSimpleName());
    }
}
