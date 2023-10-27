package LinkedList;

public class PrintLinkedList {


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
    static void print(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        Node head = null;
        head = insert(head, 10);
        head = insert(head, 20);
        head = insert(head, 30);
        head = insert(head, 40);
        print(head);

    }}