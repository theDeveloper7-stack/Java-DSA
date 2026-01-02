package OOP.Polymorphism;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Shapes sh = new Shapes();
        Shapes ci = new Circle();
        Shapes sq = new Square();

        sh.area();
        ci.area();
        sq.area();

        // Compile time polymorphism or static polymorphism
        /*
            It is the type of the polymorphism in which the method call
            is decided by the compile time.
            (This is achieved by method overloading).
                Method overloading........
                    It occurs when there are multiple methods with same name but
                    with different no. of parameters
                    different in order of dataType of the parameters or
                    different return type.
         */

        // RunTime polymorphism / Dynamic polymorphism
        /*
            In this type of polymorphism it is decided in run time
            which method to be called.
            (It is achieved by method overriding)
                Method overriding......
                    It says that if there are methods with
                    same name and same parameter in child class and parent class
                    then it depends on the object type and not the object reference
                    that which method should be called.
         */

        /*
            Dynamic method dispatch.....................
                It is the mechanism by which the JVM decides
                that which over-ridden method is called depends on
                the object type and not the reference type.
         */
    }
}
