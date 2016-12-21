package patterns.factory;

/**
 * Created by torree on 21/12/2016.
 */
public class OracleConnection extends Connection {
    public OracleConnection() {
    }

    public String description(){
    return "Oracle";
    }

}
