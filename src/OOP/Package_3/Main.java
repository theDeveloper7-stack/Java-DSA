package OOP.Package_3;

public class Main {

    static void greeting(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        /*
        Why main method is static.............?

        static elements are accessible without the object.
        since without the main you are not able to run the java program.
        if main is not mentioned as static , we have to create object of that class.
        so how can you create an object when main is the very first thing to run the program.

         */

        Human h1 = new Human(23,"roshan",25.8f,false);
        Human h2 = new Human(28,"kumar",30.8f,true);

        System.out.println(h2.name);
        System.out.println(h1.population);
        System.out.println(h2.population);

        // this will return 1 and 1, it should show 2 cause there are 2 human objects.
        // so we need to declare the population variable as static.

        greeting();
        // you can not access a non-static element inside a static element.
    }
}
