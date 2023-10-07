package Multithreading;

public class CreateThreadRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
        }
    }

    public void run(int a , int b) {
        for (int i = 0; i <10 ; i++) {
            System.out.println(i+1);
        }
    }

    public static void main(String[] args) {
        CreateThreadRunnable ct = new CreateThreadRunnable();
        Thread th = new Thread();
        th.start();


    }
}
