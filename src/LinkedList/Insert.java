package LinkedList;

public class Insert {

    static Node insert(Node head, int data) {
        Node new_node = new Node(data);
        if (head == null) {
            return new_node;
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = new_node;
        return head;
    }

    // print the value of linkedlist

    public static void main(String[] args) {
       Node head = null;
       head = insert(head , 10);
       head = insert(head , 20);
       head = insert(head , 30);
       head = insert(head , 40);

       /* Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        Node head = a;*/
    }
}

class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
        next = null;
    }
}
