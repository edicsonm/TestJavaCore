package patterns.strategy;

/**
 * Created by torree on 21/12/2016.
 */
public class Tester {
    public static void main(String[] args) {
        StreetRacer streetRacer = new StreetRacer();
        FormulaOne formulaOne = new FormulaOne();
        streetRacer.go();
        formulaOne.go();
    }
}
