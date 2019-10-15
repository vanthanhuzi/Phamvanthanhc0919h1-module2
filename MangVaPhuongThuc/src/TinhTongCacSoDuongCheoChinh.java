import java.util.Scanner;

public class TinhTongCacSoDuongCheoChinh {
    public static Scanner input = new Scanner(System.in);
    public static int[][] array;
    public static int m, n;

    public static void addArray() {
        System.out.println("nhập vào tọa độ của mảng: ");
        System.out.println("số hàng: m = ");
        m = input.nextInt();
        System.out.println("số cột: n = ");
        n = input.nextInt();
        array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("a[" + i + "]" + "[" + j + "]");
                array[i][j] = input.nextInt();
            }
        }
        int i = 0;
        while (i < m) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println("\n");
            i++;
        }
    }
    public static int tinhTongDuongCheoChinh(){
        int tong = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j){
                    tong+=array[i][j];
                }
            }
        }
        return tong;

    }

    public static void main(String[] args) {
        addArray();
        System.out.println("tổng các số của đường chéo chính là: "+ tinhTongDuongCheoChinh());
    }
}
