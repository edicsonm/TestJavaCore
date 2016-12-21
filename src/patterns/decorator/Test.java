package patterns.decorator;

/**
 * Created by torree on 21/12/2016.
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        System.out.println(computer.description());
        computer = new Disk(computer);
        System.out.println(computer.description());
        computer = new CD(computer);
        System.out.println(computer.description());
        computer = new Monitor(computer);
        System.out.println(computer.description());
    }
}
