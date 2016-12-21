package patterns.builder.example2Delete;

/**
 * Created by torree on 16/12/2016.
 */
public abstract class AutoBuilder {

    protected Auto auto;

    public Auto getAuto() {
        return auto;
    }

    public void crearAuto() {
        auto = new Auto();
    }

    public abstract void buildMotor();
    public abstract void buildModelo();
    public abstract void buildMarca();
    public abstract void buildPuertas();

}
