package patterns.factory;

/**
 * Created by torree on 21/12/2016.
 */
public class FirstFactory {
    protected String type;

    public FirstFactory(String t) {
        type = t;
    }

    public Connection createConnection() {
        if (type.equals("Oracle")) {
            return new OracleConnection();
        } else if (type.equals("SQL Server")) {
            return new SqlServerConnection();
        } else {
            return new MySQLConnection();
        }
    }
}
