package behavior.quack;

/**
 * Created by Роман on 26.07.2016.
 * Quacks that squeak.
 */
public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeak...");
    }
}
