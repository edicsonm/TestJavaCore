package patterns.decorator;

/**
 * Created by torree on 21/12/2016.
 */
public class CD extends ComponentDecorator {
    Computer computer;

    public CD(Computer c) {
        computer = c;
    }

    @Override
    public String description() {
        return computer.description() + " and a CD";
    }
}
