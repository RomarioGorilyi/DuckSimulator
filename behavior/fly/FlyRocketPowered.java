package behavior.fly;

/**
 * Created by Роман on 26.07.2016.
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
