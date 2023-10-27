package LinkedList;

public class LinkedListt {
    //    1->2->3
    static Node addFirst(Node head, int data) {
        Node new_node = new Node(data);
        if (head == null) {
            return new_node;
        }
        new_node.next = head;
        head = new_node;
        return head;
    }

    static Node addLast(Node head, int data) {
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

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    static int sumAll(Node head) {
        Node temp = head;
        int sum = 0;
        while (temp != null) {
            sum = sum + temp.data;
            temp = temp.next;
        }
        return sum;
    }
    // len 5;
    // int a 4;
    static void lastSecond(Node head){
        int length = 0;
        Node temp = head;
        while (temp != null){
            length++;
            temp =  temp.next;
        }
        length = length -2;
        Node tmp = head;
        for (int i = 1; i <=length ; i++) {
            tmp = tmp.next;
        }
        System.out.println("Last second : "+tmp.data);

    }



    public static void main(String[] args) {
        Node head = null;
        head = addFirst(head, 3);
        head = addFirst(head, 2);
        head = addFirst(head, 1);
        head = addFirst(head, 7);
        printList(head);
        head = addLast(head, 9);
        printList(head);
        System.out.println("Sum :  " + sumAll(head));
        lastSecond(head);

    }
}
