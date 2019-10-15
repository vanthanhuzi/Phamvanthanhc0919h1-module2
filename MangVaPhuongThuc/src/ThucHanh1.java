
import java.util.Scanner;

public class ThucHanh1{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int option ;

        do{
            System.out.println("Menu\n"+"1.Chuyen do C sang do K\n"+"2.Chuyen do K sang do C\n"+
                    "3.Exit");
            option = input.nextInt();
            switch (option){
            case 1: chuyenDoiDoCsangK();
            break;
            case 2:chuyenDoiDoKsangC();
            break;
            case 3:
                System.out.println("thoat khoi");
                break;
                default:
                    System.out.println("fail");
        }
        }while (option!=3);
    }
    public static double chuyenDoiDoCsangK(){
        Scanner input = new Scanner(System.in);
        System.out.println("nhap nhiet do C: ");
        double C = input.nextDouble();
        double K = (9/5)*C+32;
        System.out.println(C+"do C = "+ K + "do K");
        return K;
    }
    public static double chuyenDoiDoKsangC(){
        Scanner input = new Scanner(System.in);
        System.out.println("nhap nhiet do K: ");
        double K = input.nextDouble();
        double C = (5.0/9)*(K-32);
        System.out.println(K+"do K = "+ C + "do C");
        return C;
    }
}