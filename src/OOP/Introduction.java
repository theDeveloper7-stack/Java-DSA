package OOP;

public class Introduction {
    // Data of 5 students
    /*
        A class is a named grouped of properties and function.
        Class starts with a capital letter.

        class is a logical construct and object is physical reality.
        object is an instance of the class.

        . operator is used to access the elements from the class.
     */
    public static class Student {
        int rollNo;
        String name;
        float marks;

        void greetings(){
            System.out.println("hello "+ name);
        }

        Student(){
            this(0,"default person",100f);
            // this is how you call a constructor from another constructor.
        }

        Student(int rollNo,String name,float marks){
            // constructor is a special function that runs when you create an object & it allots some variable.
            this.rollNo = rollNo;
            this.name = name;
            this.marks = marks;
        }
        // this key word is replaced by the object that you created.
    }
    public static void main(String[] args) {
        Student s1 = new Student(1,"roshan",90f);
        Student s2 = new Student(2,"kanha",80f);
        Student random = new Student();

        // s1 is the object of the student class.
        // new keyword dynamically allots memory and returns a reference to it.
        // System.out.println(s1);
        // it will give some random value.
        /*
        whenever we try to access the element in the
        class it will 1st check that any value is assigned to the object,
        if not it will give the default value or the value that is assigned in the class.
         */
        System.out.println(s1.rollNo);
        s1.greetings();
        s2.greetings();

        System.out.println(random.name);
    }
}
