import java.util.Arrays;
import java.util.Scanner;

public class ThucHanhDaoNguocCacPhanTuMang {
    public static int[] array;
    public static Scanner input = new Scanner(System.in);
    public static void addArray(){
        System.out.println("nhap số lượng phần tử muốn thêm vào mảng: ");
        int n = input.nextInt();
        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("a["+i+"]= ");
            array[i] = input.nextInt();
        }
        return;
    }
    public static int inRaPhanTuLonNhat(){
        int index=0;
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
                index = i;
            }

        }  System.out.println("phần tử  lớn nhất trong mảng là "+ max+", chỉ số là "+ index);
        return index;
    }
    public static void daoNguocArray(){
        for (int i = 0; i < array.length/2 ; i++) {
             int tem = array[i];
             array[i] = array[array.length - i -1];
            array[array.length - i -1] = tem;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        addArray();
        inRaPhanTuLonNhat();
        daoNguocArray();
    }
}
