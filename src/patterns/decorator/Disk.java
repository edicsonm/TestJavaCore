package patterns.decorator;

/**
 * Created by torree on 21/12/2016.
 */
public class Disk extends ComponentDecorator {

    Computer computer;

    public Disk(Computer c) {
        computer = c;
    }

    @Override
    public String description() {
        return computer.description() + " and a disk";
    }
}
