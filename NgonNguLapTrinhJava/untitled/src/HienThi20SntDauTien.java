import java.util.Scanner;

public class HienThi20SntDauTien {
    public static boolean kt_snt(int n) {
        boolean kt = true;
        if (n < 2)
            kt = false;
        else if (n == 2) {
            kt = true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    kt = false;
                    break;
                } else kt = true;
            }
        }
        return kt;

    }

    public static void main(String[] args) {
        System.out.println("nhap so nguyen to can liet ke: ");
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int index = 0;
        for (int i = 0; ; i++) {
            if(kt_snt(i)){
                index++;
                System.out.println(i+",");
            }
            if (index==count)
                break;
        }

    }
}
