package Stack;
//*139. WAP to insert the value, print the value program for stack* 📥📤
import static Stack.Implement_stack.Stack.head;
import static Stack.Implement_stack.Stack.isEmpty;
public class Implement_stack {
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    ///////////////////////////////
    static class Stack {
        public static Node head;
        public static boolean isEmpty() {
            return head == null;
        }
        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head; // new node ka next head ban jayega
            head = newNode; // head ban jayega new node
        }
    }
    public static int pop() { // delete and return
        if (isEmpty()) {
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }
    public static int peek() {
        if (isEmpty()) {
            return -1;
        }
        return head.data;
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(41);
        s.push(95);
        s.push(11);
        s.push(33);

        while (!isEmpty()) {
            System.out.println(peek());
            pop();
        }

    }
}
