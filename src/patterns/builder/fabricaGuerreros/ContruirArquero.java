package patterns.builder.fabricaGuerreros;

/**
 * Created by torree on 16/12/2016.
 */
public class ContruirArquero extends ConstructorDeGuerreros {
    {
        getGuerrero();
    }

    @Override
    public void registar() {
        System.out.println("Registrando  Guerrero");
        Armamento armamento = new Armamento();
        armamento.setNombre("Arco");
        armamento.setAlcance("150 mts");
        guerrero.setArmamento(armamento);
        guerrero.setNombre("Arquero");
        guerrero.setEstatura("1.50");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenando Guerrero");
    }

    @Override
    public void equipar() {
        System.out.println("Equipando Guerrero en el almacen ... ");

    }
}
