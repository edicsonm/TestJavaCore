package patterns.factory;

/**
 * Created by torree on 21/12/2016.
 */
public class TestConnection {
    public static void main(String[] args) {
        FirstFactory factory = new FirstFactory("MySQL");
        Connection asdasd = factory.createConnection();
        System.out.println(asdasd.description());
    }
}
