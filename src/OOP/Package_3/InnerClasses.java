package OOP.Package_3;
class Test2{
    static String name;
    public Test2(String name){
        Test2.name = name;
    }
}
public class InnerClasses {
    // outer class can never be static.
    static class Test{
        // since this class is dependent on the outer class so it can be static.
        String name;

        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Kanha");
        Test2 b = new Test2("Rahul");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
