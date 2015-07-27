package c.mars;

import c.mars.strategy.abs.Duck;
import c.mars.strategy.imp.FlyRocketPowered;
import c.mars.strategy.imp.MallardDuck;
import c.mars.strategy.imp.ModelDuck;

public class Main {

    public static void main(String[] args) {
        MallardDuck mallardDuck=new MallardDuck();
        show(mallardDuck);

        System.out.println("\n\n---\n");

        ModelDuck modelDuck=new ModelDuck();
        show(modelDuck);
        System.out.println("\n--changed==\n");
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        show(modelDuck);
    }

    private static void show(Duck duck){
        duck.display();
        duck.quack();
        duck.swim();
        duck.fly();
    }
}
