package patterns.builder.example2Delete;

/**
 * Created by torree on 16/12/2016.
 */
public class FabricaAutos {

    private AutoBuilder autoBuilder;

    public void contruirAuto(){
        autoBuilder.crearAuto();
        autoBuilder.buildMarca();
        autoBuilder.buildModelo();
        autoBuilder.buildMotor();
        autoBuilder.buildPuertas();
    }

    public void setAutoBuilder(AutoBuilder autoBuilder) {
        this.autoBuilder = autoBuilder;
    }

    public Auto getAuto(){
        return autoBuilder.getAuto();
    }

}
