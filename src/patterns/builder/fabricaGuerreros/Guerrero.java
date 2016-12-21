package patterns.builder.fabricaGuerreros;

/**
 * Created by torree on 16/12/2016.
 */
public class Guerrero {

    private String nombre;
    private String estatura;
    private Armamento armamento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    public Armamento getArmamento() {
        return armamento;
    }

    public void setArmamento(Armamento armamento) {
        this.armamento = armamento;
    }
}
