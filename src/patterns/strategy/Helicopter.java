package patterns.strategy;

/**
 * Created by torree on 21/12/2016.
 */
public class Helicopter extends Vehicle{
    public Helicopter() {
        setGoAlgorithm(new GoByFlyingFast());
    }
}
