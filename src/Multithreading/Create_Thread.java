package Multithreading;
//
//18. Create and run the thread by using the Thread */

public class Create_Thread extends Thread {
    // Step 1 : First to extend a Thread class
    //Step 2 : override the run method and write the code
    //Step 3 : Create a object of class
    //Step 4 : call the start() method


    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        Create_Thread T = new Create_Thread();
        T.start();
        System.out.println("Periority of this thread  "+T.getPriority()); //
    }
}
