package entity;

import behavior.fly.FlyWithWings;
import behavior.quack.Quack;

/**
 * Created by Роман on 26.07.2016.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
