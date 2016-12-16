package uno;

/**
 * Created by torree on 15/12/2016.
 */
public class A {
    int value = 1;

    {
        System.out.println("UNO");
    }

    public A() {
        System.out.println("DOS");
    }

    public A(int value) {
        System.out.println("TRES");
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        return this.getValue() == ((A) o).getValue() ? true : false;
    }
}
