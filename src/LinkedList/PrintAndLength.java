package LinkedList;
//*137. Write the method to Print the LinkedList and find the length* 🔗
public class PrintAndLength {
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
            System.out.print(temp.data+" ---> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    static void lengthList(Node head){

        Node temp = head;
        int count =0;
        while (temp != null){
            count++;
          temp = temp.next;
        }
        System.out.println("Length of list is :  "+count);
    }
    public static void main(String[] args) {
        Node head = null;
        head = insert(head, 12);
        head = insert(head, 2);
        head = insert(head, 112);
        head = insert(head, 15);
        printList(head);
        lengthList(head);

    }
}

