package LinkedList;

/**
 *
 323. Insert a node at the end of a linked list:(🔍 /📚 /💻)
 Input: Linked list: 1 -> 2 -> 3, Value to insert: 4
 Output: 1 -> 2 -> 3 -> 4

 */
public class InsertAtLast {
    static void print(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }

static  public  Node addLast (int data , Node head){
    Node new_node  = new Node(data);
    if (head == null){
        return new_node;
    }

    Node temp = head;

    while (temp.next!=null){
        temp = temp.next;
    }

    temp.next = new_node;
    return head;
}
    public static void main(String[] args) {
        Node head  = null;
        head = addLast(1,head);
        head = addLast(2,head);
        head = addLast(3,head);
        System.out.println("before adding in last ");
        print(head);
        head = addLast(4 ,head);
        System.out.println();
        System.out.println("After adding in last ");
        print(head);
    }
}
