package patterns.builder.example2Delete;

/**
 * Created by torree on 16/12/2016.
 */
public class Main {
    public static void main(String[] args) {
        FabricaAutos fabrica = new FabricaAutos();
        fabrica.setAutoBuilder(new FiatBuilder());
        fabrica.contruirAuto();
        Auto fiat = fabrica.getAuto();

        System.out.println(String.format("Marca %s, numero de puertas %s",fiat.getMarca(), fiat.getNumeroPuertas()));

    }
}

