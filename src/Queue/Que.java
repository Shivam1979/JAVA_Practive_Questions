package Queue;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Que {


    public static void main(String[] args) {


        LinkedList <Integer> queue =  new LinkedList<>();
        queue.offer(12);
        queue.offer(2);
        queue.offer(42);
        queue.poll(); //  return null
        queue.remove(); // return errro
        queue.offer(127);
        System.out.println(queue.peek() );

        System.out.println(queue);

    }
}
