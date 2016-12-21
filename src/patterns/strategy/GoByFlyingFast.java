package patterns.strategy;

/**
 * Created by torree on 21/12/2016.
 */
public class GoByFlyingFast implements GoAlgorithm {

    @Override
    public void go() {
        System.out.println("Now I’m flying fast.");
    }
}
