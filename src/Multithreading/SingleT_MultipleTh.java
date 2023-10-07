package Multithreading;

public class SingleT_MultipleTh extends Thread{
    public void run(){
        System.out.println("TASKK");
    }

    public static void main(String[] args) { // main thread create by JVM
        SingleT_MultipleTh sm = new SingleT_MultipleTh();
        sm.start();
        SingleT_MultipleTh t2 = new SingleT_MultipleTh();
        t2.start();
    }
}
