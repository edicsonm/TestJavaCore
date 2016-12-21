package patterns.strategy;

/**
 * Created by torree on 21/12/2016.
 */
public class StreetRacer extends Vehicle {

    public StreetRacer() {
        setGoAlgorithm(new GoByDrivingAlgorithm());
    }
}
