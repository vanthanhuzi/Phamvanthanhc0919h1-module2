import java.util.Scanner;

public class DemSoLanXuatHienCuaKiTu {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("nhập chuỗi: ");
        String str = input.next();
        System.out.println("nhập kí tự cần kiểm tra: ");
        String check = input.next();
        int dem = 0;
        for (int i = 0; i < str.length(); i++) {
            if(check.equals(str.substring(i,i+1))){
                dem++;
            }

        }
        System.out.println("số lần xuất hiện là : ");
        System.out.println(dem);
    }
}
