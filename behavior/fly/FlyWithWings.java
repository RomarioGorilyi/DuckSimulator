package behavior.fly;

/**
 * Created by Роман on 26.07.2016.
 * Flying implementation for ducks that DO fly
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!!");
    }
}
