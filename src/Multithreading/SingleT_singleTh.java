package Multithreading;

public class SingleT_singleTh extends  Thread{


    @Override
    public void run() {
        System.out.println("HEllo");
    }

    public static void main(String[] args) {
        SingleT_singleTh t = new SingleT_singleTh();
        t.start();
    }
}
