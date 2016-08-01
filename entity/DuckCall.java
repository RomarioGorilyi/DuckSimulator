package entity;

import behavior.quack.Quack;
import behavior.quack.QuackBehavior;

/**
 * Created by Роман on 26.07.2016.
 * A duck call is a device that hunters use to mimic the calls (quacks) of ducks.
 */
public class DuckCall {
    QuackBehavior quackBehavior;

    public DuckCall() {
        quackBehavior = new Quack();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
