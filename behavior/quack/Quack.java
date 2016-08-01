package behavior.quack;

/**
 * Created by Роман on 26.07.2016.
 * Quacks that really quack.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack...");
    }
}
