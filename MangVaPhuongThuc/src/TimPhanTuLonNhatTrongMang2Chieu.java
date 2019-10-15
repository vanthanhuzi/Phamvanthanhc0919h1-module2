import java.util.Arrays;
import java.util.Scanner;

public class TimPhanTuLonNhatTrongMang2Chieu {
    public static int[][] array;
    public static Scanner input = new Scanner(System.in);
    public static int m, n;

    public static void addArray() {
        System.out.println("nhập vào tọa độ của mảng:");
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

    public static int timPhanTulonNhat() {
        int index1 = 0, index2 = 0;
        int max = array[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                    index1 = i;
                    index2 = j;
                }
            }
        }
        System.out.println("giá trị lớn nhất của mảng là " + max);
        System.out.println("tọa độ là : (" + index1 + ";" + index2 + ")");
        return index1;
    }

    public static void main(String[] args) {
        addArray();
        timPhanTulonNhat();
    }
}
