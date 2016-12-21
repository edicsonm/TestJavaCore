package patterns.builder.fabricaGuerreros;

/**
 * Created by torree on 16/12/2016.
 */
public abstract class ConstructorDeGuerreros {

    protected Guerrero guerrero;

    public void getGuerrero(){
        this.guerrero = new Guerrero();
    }

    public abstract void registar();

    public abstract void entrenar();

    public abstract void equipar();
}
