package OOP.Inheritance;

public class BoxWeight extends Box {
    // The extends keyword is used to inherit the properties of a class
    float weight;

    BoxWeight(){
        this.weight = -1;
    }

    BoxWeight(float length, float width , float height, float weight){
        super(length,width,height);
        // basically it calls the parent class constructor.
        // used to initialize the values of parent class (but can not access private members).
        // if the object is of the parent class it won't be able to access the child class properties.
        this.weight = weight;

        // System.out.println(super.weight);

        /*
            If there is a variable in parent class with same name as the child class
            then if we use this.variable_name then it will give the access of the child class variable.
            but if we use super.variable_name then it weill give the access of the parent class variable.
         */
    }

    BoxWeight(BoxWeight other){
        super(other);
        other.weight = weight;
    }
}
