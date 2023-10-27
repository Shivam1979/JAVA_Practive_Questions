package LinkedList;

public class MiddleElement {


    static public Node addFirst(Node head, int data) {
        Node new_node = new Node(data);
        if (head == null) {
            return new_node;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new_node;
        return head;
    }

    static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static void middleNode(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        int mid = (count / 2);
        System.out.println();
        Node n = head;
        for (int i = 1; i <= mid; i++) {
            n = n.next;
        }
        System.out.println("Middle Node of LinkedList : "+n.data);
       /* System.out.println("Total number of element "+count);
        System.out.println("mid "+mid);*/
    }
    public static void main(String[] args) {
        Node head = null;
        head = addFirst(head, 1);
        head = addFirst(head, 2);
        head = addFirst(head, 3);
        head = addFirst(head, 4);
        head = addFirst(head, 5);
        print(head);
        middleNode(head);
    }
}
