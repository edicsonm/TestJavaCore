package dos;

/**
 * Created by torree on 15/12/2016.
 */
public class Super_class {
    protected int num;

    {
        num = 19;
        System.out.println(" Super_class This is the default constructor");
    }

    public Super_class(){
        System.out.println(" Super_class This is the Constructor");
    }

    public void display() {
        System.out.println(" Super_class This is the display method");
    }
}
