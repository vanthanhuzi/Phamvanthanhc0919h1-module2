package test;

public class main extends Thread {
       int a =1000;


    public synchronized void rutTien() throws InterruptedException {
        if (a > 0) {
            Thread.sleep(1000);
            a = a - 1000;
            System.out.println(a);
        } else System.out.println("không còn tiền");
    }



    @Override
    public void run() {
        try {
            rutTien();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        main x1 = new main();
        Thread a = new Thread(x1);
        Thread x2 = new Thread(x1);


        a.start();
        x2.start();

// nghĩa là Thread là một lớp cha đa luồng của mọi lớp, có thể dùng để tạo các biến tham chiếu về chung
        // một địa chỉ lưu đối tượng trong bộ nhớ heap sau đó tạo một biến tham chiếu khác tới địa chỉ đó tiếp tục thực
        // hiện công việc đang làm trên đối tượng đã tạo


    }
}


