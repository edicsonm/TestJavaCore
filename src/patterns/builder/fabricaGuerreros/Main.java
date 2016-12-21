package patterns.builder.fabricaGuerreros;

/**
 * Created by torree on 16/12/2016.
 */
public class Main {
    public static void main(String[] args) {

        Comandante comandante = new Comandante();

        ConstructorDeGuerreros  caballero = new ContruirCaballero();
        comandante.entrenadorDeGuerrero(caballero);
        comandante.reclutarGuerrero();

        ConstructorDeGuerreros  arquero = new ContruirArquero();
        comandante.entrenadorDeGuerrero(arquero);
        comandante.reclutarGuerrero();
    }
}
