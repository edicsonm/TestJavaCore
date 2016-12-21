package patterns.builder.example2Delete;

/**
 * Created by torree on 16/12/2016.
 */
public class FiatBuilder extends AutoBuilder {

    @Override
    public void buildMotor() {
        Motor motor = new Motor();
        motor.setNumero(122355);
        motor.setPotencia("23 HP");
        auto.setMotor(motor);
    }

    @Override
    public void buildModelo() {
        auto.setModelo("Palio");
    }

    @Override
    public void buildMarca() {
        auto.setMarca("Fiat");
    }

    @Override
    public void buildPuertas() {
        auto.setNumeroPuertas(2);
    }
}
