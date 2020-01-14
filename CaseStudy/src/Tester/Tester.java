package Tester;

import java.util.Scanner;

public class Tester {
    public static boolean a(String name) {
        if (name.equals("thanh"))
            return true;
        else return false;
    }

    public String show() {
        System.out.println(" thanh");
        return null;
    }

    public static void main(String[] args) {
        // Pham Van Thanh
//        String regex ="^([A-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([A-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$";
//        String regex = "^([\\p{Lu}]|([\\p{Lu}][\\p{Ll}]{1,}))([\\s]([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,6}$";
//        String regex = "^[A-Z]{1}[a-z]*(\\s[A-Z]{1}[a-z]*)*";

        Tester tester = new Tester();
        tester.show();

    }

}
