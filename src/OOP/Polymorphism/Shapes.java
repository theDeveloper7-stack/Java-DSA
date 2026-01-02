package OOP.Polymorphism;

public class Shapes {
    // a method that is declared as final can not be overridden.
    // a class which is declared as final can not be inherited.
    // when a class is declared as final implicitly all its methods also considered as final.

    // static methods can not be overridden.
    void area(){
        System.out.println("I am in shapes area..");
    }
}
