package LinkedList;

public class DeleteNode {

    static  public  Node addFirst (Node head,int data  ){
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

    static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    static void deleteNode(int val, Node head) {
        Node temp = head;
        int count = 0;
        while ((temp.data) != val){
            temp =  temp.next;
            count++;
        }
        Node pre = head;
        for (int i = 0; i <count-1; i++) {
            pre = pre.next;
        }
        pre.next = pre.next.next;
        System.out.println();
//        System.out.println(count);
    }
    public static void main(String[] args) {
        Node head = null;
        head = addFirst(head, 1);
        head = addFirst(head, 2);
        head = addFirst(head, 3);
        head = addFirst(head, 4);
        head = addFirst(head, 5);
        head = addFirst(head, 6);
        print(head);
        deleteNode(4 , head);
        System.out.println();
        print(head);


    }
}
