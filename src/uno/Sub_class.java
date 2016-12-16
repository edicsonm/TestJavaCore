package uno;

import dos.Super_class;

/**
 * Created by torree on 15/12/2016.
 */
public class Sub_class extends Super_class {

    int num;

    {
        num = 99;
        System.out.println(" Sub_class This is the default constructor");
    }

    public Sub_class(){
        super();
        System.out.println(" Sub_class This is the constructor");
    }

    public void display() {
        System.out.println(" Sub_class This is the display method");
    }

    public void my_method() {
        this.display();
        super.display();
//        System.out.println("value of the variable named num in sub class:"+ this.num);
//        System.out.println("value of the variable named num in super class:"+ super.num);
    }

    public static void main(String args[]) {
        new Sub_class().my_method();

    }

}
