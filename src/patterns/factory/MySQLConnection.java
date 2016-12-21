package patterns.factory;

/**
 * Created by torree on 21/12/2016.
 */
public class MySQLConnection extends Connection {

    public MySQLConnection() {
    }

    public String description() {
        return "MySQL";
    }

}
