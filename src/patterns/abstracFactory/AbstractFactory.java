package patterns.abstracFactory;

/**
 * Created by torree on 16/12/2016.
 */
public abstract  class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}
