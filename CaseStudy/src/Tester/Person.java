package Tester;

import java.util.Scanner;

public class Person {
    String hihi;

    int a() {
        return 6;
    }

    public Person() {
    }

    void Show() {
        System.out.println(" thành ");
    }

    public Person(String hihi) {
        this.hihi = hihi;
    }

    public String getHihi() {
        return hihi;
    }

    public void setHihi(String hihi) {
        this.hihi = hihi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 0) {
            System.out.println("1");
        }
        if (a > 2) {
            System.out.println("2");
        }
    }
}

