package Queue.Prority;

import java.util.PriorityQueue;

public class PrioityQueue {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        q.add(56);
        q.add(55);
        //q.add("ds"); we only add the homogeneous
        q.add(55);
        q.offer(87);
        q.offer(587);
        q.offer(827);

        q.offer(8700);
        q.offer(10);
        System.out.println(q);
        System.out.println(q.element());// error if elemnt is present
        System.out.println(q.peek()); // null if elememnt ids not present
        System.out.println(q.remove()); //
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());
    }
}
