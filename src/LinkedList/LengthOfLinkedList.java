package LinkedList;

public class LengthOfLinkedList {
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


static int  printAndLength(Node head){
    Node tmp = head;
    int count = 0;
    while (tmp != null){
        System.out.print(tmp.data+" ");
        tmp = tmp.next;
        count++;
    }

    System.out.println();
    return count;
}
    public static void main(String[] args) {
        Node head = null;
        head = insert(head , 10);
        head = insert(head , 20);
        head = insert(head , 30);
        head = insert(head , 40);
        int count = printAndLength(head);
        System.out.println("The size of linkedList "+count);
    }
}
