package behavior.quack;

/**
 * Created by Роман on 26.07.2016.
 * Quacks that make no sound at all.
 */
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
