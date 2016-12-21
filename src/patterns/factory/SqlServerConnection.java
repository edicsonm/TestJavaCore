package patterns.factory;

/**
 * Created by torree on 21/12/2016.
 */
public class SqlServerConnection extends Connection {

    public SqlServerConnection() {
    }

    public String description() {
        return "SqlServer";
    }

}
