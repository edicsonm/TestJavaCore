package patterns.builder.example2Delete;

/**
 * Created by torree on 16/12/2016.
 */
public class FordBuilder extends AutoBuilder {

    @Override
    public void buildMotor() {
        Motor motor = new Motor();
        motor.setNumero(756512);
        motor.setPotencia("20 HP");
        auto.setMotor(motor);
    }

    @Override
    public void buildModelo() {
        auto.setModelo("Focus");
    }

    @Override
    public void buildMarca() {
        auto.setMarca("Ford");
    }

    @Override
    public void buildPuertas() {
        auto.setNumeroPuertas(4);
    }
}
