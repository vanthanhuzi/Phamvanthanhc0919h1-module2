import java.util.Arrays;
import java.util.Scanner;

public class ThucHanh2 {
public static String[] student;
    public static  Scanner input = new Scanner(System.in);
    public static String[] addName(){

        System.out.println("nhap chieu dai của mảng: ");
        int n = input.nextInt();
         student= new String[n];
        for (int i = 0; i < student.length; i++) {
            System.out.println("student["+i+"]");
            student[i] = input.next();
        }
        return student;
    }
    public static void display_Name(){
        for (int i = 0; i < addName().length; i++) {
            System.out.println(addName()[i]+"\n");
        }
    }
    public static void KT_name(){
        int index=0;
        System.out.println("nhap ten cần kiểm tra");
        String name = input.nextLine();
        for (int i = 0; i < addName().length; i++) {
            if(addName()[i].equals(name)){
                index = i;
                System.out.println("tên hợp lệ tại vị trí: "+ index);
                break;
            }
        }
        return;
    }
    public static void main(String[] args) {
       addName();
       display_Name();
       KT_name();
    }
}
