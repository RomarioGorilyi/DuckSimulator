package entity;

import behavior.fly.FlyNoWay;
import behavior.quack.Quack;

/**
 * Created by Роман on 26.07.2016.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck.");
    }
}
