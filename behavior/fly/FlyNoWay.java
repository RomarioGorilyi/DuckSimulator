package behavior.fly;

/**
 * Created by Роман on 26.07.2016.
 * Flying implementation for ducks that do NOT fly (like rubber ducks and decoy ducks).
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly.");
    }
}
