package patterns.abstracFactory;

/**
 * Created by torree on 16/12/2016.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
