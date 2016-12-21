package patterns.factoryBasic;

/**
 * Created by torree on 16/12/2016.
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
