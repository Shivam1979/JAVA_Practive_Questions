package Multithreading;
//current , isalive

public class GetsetName extends Thread {


  /*  public static void main(String[] args) { // main thread create by JVM

        System.out.println("Hello");//Hello
        System.out.println(Thread.currentThread().getName()); // main
        Thread.currentThread().setName("Shivam");
        System.out.println(Thread.currentThread().getName()); //Shivam

    }*/





    @Override
    public void run() {
        Thread.currentThread().setName("run");
        System.out.println("Hee " + Thread.currentThread().getName() );
    }

    public static void main(String[] args) {
        System.out.println("HEllo "+ Thread.currentThread().getName());
        SingleT_singleTh t = new SingleT_singleTh();

        System.out.println(Thread.currentThread().isAlive());
        System.out.println(t.isAlive());
        t.start();
    }
}
