package patterns.strategy;

/**
 * Created by torree on 21/12/2016.
 */
public class StartTheRace {
    public static void main(String[] args) {
        StreetRacer streetRacer = new StreetRacer();
        FormulaOne formulaOne = new FormulaOne();
        Helicopter helicopter = new Helicopter();
        Jet jet = new Jet();
        jet.setGoAlgorithm(new GoByDrivingAlgorithm());
        streetRacer.go();
        formulaOne.go();
        helicopter.go();
        jet.go();
    }
}
