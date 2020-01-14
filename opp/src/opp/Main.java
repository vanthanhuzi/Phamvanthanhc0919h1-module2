package opp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLy quanLy = new QuanLy();
        boolean check = true;
        do{
       phay();
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        switch (n){
            case 1:{
                System.out.println("1.Công Nhân "+ "2. Kỹ Sư");
                int m = Integer.parseInt(scanner.nextLine());
                switch (m){
                    case 1: {
                        CongNhan congNhan = new CongNhan();
                        congNhan.inputInfor();
                        quanLy.addCanBo(congNhan);
                        break;
                    }
                    case 2: {
                        KySu kySu = new KySu();
                        kySu.inputInfor();
                        quanLy.addCanBo(kySu);

                        break;
                    }
                    default:
                        System.out.println("nhập sai");

                }
                break;
            }
            case 2:{
                System.out.println("hiển Thị thông tin của ");
                quanLy.display();
            }
        }
    }while (check);}
    public static void phay(){
        System.out.println("1. thêm cán bộ "+"\n"+ "2. Hiển thị thông tin");
    }
}
