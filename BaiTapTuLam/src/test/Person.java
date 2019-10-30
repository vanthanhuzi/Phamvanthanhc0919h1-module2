package test;

public class Person extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("dat"+ i);
        }
    }

    @Override
    public synchronized void start() {
        System.out.println("haha");
    }
}

