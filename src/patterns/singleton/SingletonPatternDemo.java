package patterns.singleton;

import java.util.Calendar;

/**
 * Created by torree on 16/12/2016.
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();
        object.showMessage();

    }
}
