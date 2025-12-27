package OOP.Inheritance;

/*
    Every class that you create the Object class will be super class of those classes.
 */

public class Box {
    float length;
    float width;
    float height;

    // float weight;

    Box(){
        // super(); Object class
        this.height = -1;
        this.width = -1;
        this.length = -1;
    }

    // cube
    Box(float side){
        this.length = side;
        this.width = side;
        this.height = side;
    }

    Box(Box old){
        this.length = old.length;
        this.width = old.width;
        this.height = old.height;
    }

    Box(float length, float width, float height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void info(){
        System.out.println("This is the box class");
    }
}
