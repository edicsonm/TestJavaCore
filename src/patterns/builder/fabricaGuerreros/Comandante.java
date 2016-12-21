package patterns.builder.fabricaGuerreros;

/**
 * Created by torree on 16/12/2016.
 */
public class Comandante {

    private ConstructorDeGuerreros constructorDeGuerreros;

    public void entrenadorDeGuerrero(ConstructorDeGuerreros constructorDeGuerreros) {
        this.constructorDeGuerreros = constructorDeGuerreros;
    }

    public void reclutarGuerrero() {
        constructorDeGuerreros.registar();
        constructorDeGuerreros.equipar();
        constructorDeGuerreros.entrenar();
    }

}
