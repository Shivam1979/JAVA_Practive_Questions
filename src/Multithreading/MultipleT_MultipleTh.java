package Multithreading;

public class MultipleT_MultipleTh extends Thread {

    public static void main(String[] args) {
        Thread1 t1 = new Thread1(); // thread 1
        t1.start();
        t1.setPriority(10);
        Thread2 t2 = new Thread2(); // thread 2
        t2.start();
    }
}
class Thread2 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("HEllo");
        }
    }
}

class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hi");

        }
    }
}
