package patterns.strategy;

/**
 * Created by torree on 21/12/2016.
 */
public class FormulaOne extends Vehicle {
    public FormulaOne() {
        setGoAlgorithm(new GoByDrivingAlgorithm());
    }
}
