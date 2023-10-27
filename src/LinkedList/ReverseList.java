package LinkedList;

//*138. WAP to Reverse a linked list in Java? and print* ↩🔄
public class ReverseList {
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
        while (temp != null) {
            System.out.print(temp.data + " ---> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    static Node reverseList(Node head) {
        Node prev = head.next;
        Node next = head.next.next;
        head.next = null;
        while (prev != null) {
            prev.next = head;
            head = prev;
            prev = next;
            if (next != null) {
                next = next.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        head = insert(head, 1);
        head = insert(head, 2);
        head = insert(head, 3);
        head = insert(head, 4);
        printList(head);
        head = reverseList(head);
        printList(head);


    }
}
