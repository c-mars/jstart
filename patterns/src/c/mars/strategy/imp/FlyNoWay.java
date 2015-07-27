package c.mars.strategy.imp;

import c.mars.strategy.abs.FlyBehavior;

/**
 * Created by Constantine Mars on 7/27/15.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("can't fly");
    }
}
