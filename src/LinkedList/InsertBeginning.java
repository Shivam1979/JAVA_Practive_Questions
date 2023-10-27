package LinkedList;

/**
 *
 322. Insert a node at the beginning of a linked list:(🔍 /📚 /💻
 Input: Linked list: 1 -> 2 -> 3, Value to insert:
 Output: 4 -> 1 -> 2 -> 3

 */
public class InsertBeginning {
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ---> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    static public Node addFirst(int data, Node head) {
        Node new_node = new Node(data); // we created a object of the Node
        if (head == null) {// if my linkedlist is blank then we do
            return new_node;
        }
        new_node.next = head;// if it is not empty then purana wala head ko newhead.next assign kar dene
        head = new_node;// aur new wale ko head jo add karenge
        return head;
    }
    public static void main(String[] args) {
        Node head = null;
        head = addFirst(1, head);
        head = addFirst(2, head);
        head = addFirst(3, head);
        printList(head);
        head = addFirst(4 , head);
        printList(head);
    }
}
