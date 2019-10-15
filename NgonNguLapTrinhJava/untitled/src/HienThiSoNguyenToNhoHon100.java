import java.util.Scanner;
public class HienThiSoNguyenToNhoHon100 {
    public static boolean kt_snt(int n){
        boolean kt=true;
        if (n<2)
            kt=false;
        else if(n==2){
            kt = true;
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++) {
                if (n % i == 0 ) {
                    kt = false;
                    break;
                }
                else kt = true;
            }
        }
        return kt;

    }

    public static void main(String[] args) {
        System.out.println("nhập giới hạn số cần liệt kê: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        for (int i = 0; i < x; i++) {
            if(kt_snt(i)){
                System.out.print(i+",");
            }
        }
    }
}
