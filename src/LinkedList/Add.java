package LinkedList;

public class Add {
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

    static void printList(Node head) {
        Node temp = head;
        int len = 0;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            len++;
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println("Length of List is : " + len);
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = null;
        head = insert(head, 1);
        head = insert(head, 2);
        head = insert(head, 3);
        head = insert(head, 4);
        printList(head);
        head = insert(head, 5);
        printList(head);


    }
}
