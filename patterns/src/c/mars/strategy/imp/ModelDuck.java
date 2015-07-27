package c.mars.strategy.imp;

import c.mars.strategy.abs.Duck;
import c.mars.strategy.abs.FlyBehavior;

/**
 * Created by Constantine Mars on 7/27/15.
 */
public class ModelDuck extends Duck {


    public ModelDuck() {
        super();
        flyBehavior=new FlyNoWay();
        quackBehavior=new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm "+getClass().getSimpleName());
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        super.flyBehavior=flyBehavior;
    }
}
