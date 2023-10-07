package Multithreading;

public class Crea_ThreadClass extends  Thread{

    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Crea_ThreadClass ct = new Crea_ThreadClass();
        Thread th = new Thread(ct);
        ct.start();
        ct.start();
    }
}
