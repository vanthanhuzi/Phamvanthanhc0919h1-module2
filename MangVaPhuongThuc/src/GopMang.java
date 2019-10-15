import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static Scanner input = new Scanner(System.in);
    public static int[] array1;
    public static int[] array2;
    public static int[] array3;

    public static void Array1() {
        System.out.println("nhập số phần tử mảng 1: ");
        int n = input.nextInt();
        array1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("a1[" + i + "]");
            array1[i] = input.nextInt();
        }
    }

    public static void Array2() {
        System.out.println("nhập số phần tử mảng 2: ");
        int m = input.nextInt();
        array2 = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.println("a2[" + i + "]");
            array2[i] = input.nextInt();
        }
    }

    public static void Gopmang() {
        int index1 = 0;
        int index2 = 0;
        array3 = new int[array1.length+array2.length];
        for (int i = 0; i < array1.length; i++) {
                array3[i] = array1[index1];
            index1++;
        }
        for (int i = array1.length; i < (array1.length + array2.length); i++) {
           array3[i] = array2[index2];
           index2++;
        }
        System.out.println(Arrays.toString(array3));
    }
    public static void main(String[] args) {
        Array1();
        Array2();
        Gopmang();
    }
}

