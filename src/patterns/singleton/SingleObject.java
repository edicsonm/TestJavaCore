package patterns.singleton;

import java.util.Calendar;

/**
 * Created by torree on 16/12/2016.
 */
public class SingleObject {

    private static SingleObject instance = new SingleObject();
    private long time;

    private SingleObject() {
        time = Calendar.getInstance().getTimeInMillis();
    }

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }

    public long getTime() {
        return time;
    }
}
