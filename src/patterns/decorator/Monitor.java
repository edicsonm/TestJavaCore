package patterns.decorator;

/**
 * Created by torree on 21/12/2016.
 */
public class Monitor extends ComponentDecorator {

    Computer computer;

    public Monitor(Computer c) {
        this.computer = c;
    }

    @Override
    public String description() {
        return computer.description() + " and a monitor";
    }
}
