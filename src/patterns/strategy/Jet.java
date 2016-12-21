package patterns.strategy;

/**
 * Created by torree on 21/12/2016.
 */
public class Jet extends Vehicle{
    public Jet() {
        setGoAlgorithm(new GoByFlying());
    }
}
