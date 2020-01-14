import java.util.Arrays;
import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {1, 2, 2, 4, 6, 10, 3, 1, 4, 6, 8};
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));;
    }


}
