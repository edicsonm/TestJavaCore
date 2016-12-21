package patterns.factoryBasic;

/**
 * Created by torree on 16/12/2016.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
