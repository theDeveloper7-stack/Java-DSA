package OOP.Package_1;

import static OOP.Package_2.Message.message;
/*
To access any method or any element from a different package
we must import that package.
 */

/*
Files with same name can not be present
in the same package but can be present in different packages.

 */
public class Greeting {
    public static void main(String[] args) {
        System.out.println("Hi Roshan");
        message();
    }
}
