package patterns.builder.fabricaGuerreros;

import patterns.builder.fabricaGuerreros.Armamento;
import patterns.builder.fabricaGuerreros.ConstructorDeGuerreros;

/**
 * Created by torree on 16/12/2016.
 */
public class ContruirCaballero extends ConstructorDeGuerreros {
    {
        getGuerrero();
    }
    @Override
    public void registar() {
        System.out.println("Registrando Caballero");
        Armamento armamento = new Armamento();
        armamento.setNombre("Caballo");
        armamento.setAlcance("20 KM");
        guerrero.setArmamento(armamento);
        guerrero.setNombre("Caballero");
        guerrero.setEstatura("1.90");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenando Caballero");
    }

    @Override
    public void equipar() {
        System.out.println("Equipando Caballero en el almacen ... ");

    }
}
