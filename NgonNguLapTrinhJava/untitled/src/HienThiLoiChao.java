import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args) {
        System.out.println("nhập tên của bạn");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello" + name);
    }
}
