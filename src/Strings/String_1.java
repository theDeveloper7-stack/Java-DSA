package Strings;

public class String_1 {
    public static void main(String[] args) {
        String name = "Roshan Kumar";
        System.out.println(name);

        // String is a class of java and "Roshan Kumar" is an object.
        String a = "hello";
        String b = "hello";
        /*
        Are a and b same or different objects ???

        1. String pool (separate memory structure inside the heap)
            it says hey there is a = hello no need to create one and b also points to it.
        2. Immutability
            We know that 2 reference variables pointing to a same object,
            if changes happen in 1 that also reflects in second variable.
            But....... In the String it does not happen because it is immutable.
         */

        String var1 = "hi";
        System.out.println(var1);
        var1 = "hello";
        // This is not changing the object but creating one.
        System.out.println(var1);

        // Comparison
        System.out.println(a == b);
        /*
        gives output true.
        == comparator will check if reference variables are pointing to same object.
         */

        // let's create separate objects
        String obj1 = new String("roshan");
        String obj2 = new String("roshan");
        System.out.println(obj1 == obj2);
        // this will give false.
        // when you need to check only values the use equals() method
        System.out.println(obj1.equals(obj2));
        // now this will give true because now it's only checking the values not the objects.

        System.out.println(obj1.charAt(0));
        /*
        we can not do like obj1[0] so
        instead of that we use charAt() method.
         */
    }
}
