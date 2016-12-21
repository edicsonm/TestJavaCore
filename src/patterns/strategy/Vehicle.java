package patterns.strategy;

/**
 * Created by torree on 19/12/2016.
 */
public abstract class Vehicle {

    private GoAlgorithm goAlgorithm;

    public Vehicle() {
    }

    public void setGoAlgorithm(GoAlgorithm algorithm) {
        goAlgorithm = algorithm;
    }

    public void go() {
        goAlgorithm.go();
    }

}
