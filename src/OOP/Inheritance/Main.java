package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box b1 = new Box();
        //The constructor that has no para meters that one is called.
        System.out.println("Length is : "+b1.length+ "\nHeight is : "+b1.height+ "\nWidth is : "+ b1.width);
        Box b2 = new Box(4);
        //The constructor that has one para meter that one is called.
        System.out.println("Length of cube : "+b2.length+ "\nHeight of cube : "+b2.height+ "\nWidth of cube : "+ b2.width);

        Box b3 = new Box(b2);
        System.out.println("Length is : "+b3.length+ "\nHeight is : "+b3.height+ "\nWidth is : "+ b3.width);

        BoxWeight b4 = new BoxWeight();
        System.out.println("Length is : "+b4.length+"\nWeight is : "+ b4.weight);

        Box b5 = new BoxWeight(1,2,3,4);
        // here object reference is type Box that is parent but the object type is BoxWeight that is child class.
        //.......by this you can access the parent class members that is it depends on the object reference type not the object.
        // but the inverse can't be done that is BoxWeight box = new Box();
        System.out.println(b5.height);

        BoxPrice b6 = new BoxPrice(1,2,3,4,5);
        System.out.println("The box length is : "+b6.length+"\nBox weight is : "+b6.weight+"\nBox price is : "+b6.price);
    }
}
