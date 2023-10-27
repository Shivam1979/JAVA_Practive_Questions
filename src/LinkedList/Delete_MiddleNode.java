package LinkedList;

public class Delete_MiddleNode {
    static Node addFirst(int data, Node head) {
        Node new_node = new Node(data);
        if (head == null) {
            return new_node;
        }
        new_node.next = head;
        head = new_node;
        return head;
    }

    static void printList(Node head) {
        if (head == null) {
            System.out.println("List is Empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static void deleteMiddle(Node head) {

        if (head == null) {
            System.out.print("List is Empty: ");
        }
        Node temp = head;
        int len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        int mid = len / 2;
        Node tmp = head;
        for (int i = 1; i < mid; i++) {
            tmp = tmp.next;

        }
        tmp.next = tmp.next.next;
//        System.out.println("Length : " + len + " ");

    }

    public static void main(String[] args) {
        Node head = null;
        head = addFirst(5, head);
        head = addFirst(4, head);
        head = addFirst(3, head);
        head = addFirst(2, head);
        head = addFirst(1, head);
//        deleteMiddle(head);
        printList(head);
        deleteMiddle(head);
        printList(head);


    }
}
