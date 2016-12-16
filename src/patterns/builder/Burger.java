package patterns.builder;

/**
 * Created by torree on 16/12/2016.
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
