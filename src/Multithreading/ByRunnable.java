package Multithreading;
//27. Implement the thread by using the Runnable interface ?
public class ByRunnable implements Runnable {
    public void run() {
        for (int i = 1; i < 5; i++) {
            int a = i;
            switch (a){
                case  1: System.out.println("Prachi");break;
                case  2: System.out.println("Ayushi");break;
                case  3: System.out.println("Shivam");break;
                case  4: System.out.println("Tanu"); break;
                default: System.out.println("wrong input");break;
            }
        }

    }
    public static void main(String[] args) {
        ByRunnable br = new ByRunnable();
        Thread t = new Thread(br);
        t.start();
    }

}
