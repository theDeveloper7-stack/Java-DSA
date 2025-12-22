package OOP.Package_3;

public class Human {
    int age;
    String name;
    float salary;
    boolean married;
    // long population;
    static long population;

    // A static variable does not depend on any specific object.
    // It belongs to the class.

    public Human(int age, String name, float salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        // this.population += 1;
        Human.population += 1;
        // It's always good to use class name to access the static variables.
    }
}
