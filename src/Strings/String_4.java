package Strings;

public class String_4 {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            // System.out.print(ch+ " ");
            // it will print a to z.
            series += ch;
            //(a ab abc ..................)
            // here it creates new object every time we concatenate
        }
        System.out.println(series);
        // String Builder................................................
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            build.append(ch);
        }
        System.out.println(build);
        // but here it changes in the existed object.
    }
}
