package test;

//import quadraticequation.QuadraticEquation;

import java.util.Scanner;

public class MainTinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        phuongtrinh caculate = new phuongtrinh();
        System.out.println("Nhập vào hệ số của phương trình :");
        System.out.println("a = ");
        caculate.setA(input.nextInt());
        System.out.println(" b = ");
        caculate.setB(input.nextInt());
        System.out.println(" c = ");
        caculate.setC(input.nextInt());
        caculate.tinhtoan();
    }
}
