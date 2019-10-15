import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("nhap chiều dài của mảng");
        int n = input.nextInt();
        String[] array = new String[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("array["+(i)+"]= ");
            array[i] = input.next();

        }
        System.out.println(Arrays.toString(array));
    }
}
