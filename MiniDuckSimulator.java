import behavior.fly.FlyRocketPowered;
import entity.Duck;
import entity.DuckCall;
import entity.MallardDuck;
import entity.ModelDuck;

/**
 * Created by Роман on 26.07.2016.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        DuckCall duckCall = new DuckCall();
        duckCall.performQuack();
    }
}
