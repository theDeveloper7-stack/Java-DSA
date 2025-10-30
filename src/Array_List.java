import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        System.out.println(list.contains(4));
        list.set(2,99);
        System.out.println(list);
        // and lots of methods can be applied

        // input
        // for (int i = 0; i < list.size(); i++) {
            // System.out.println(list.get(i));
        //}
    }
}
