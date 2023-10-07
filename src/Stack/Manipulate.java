package Stack;

import java.util.List;
import java.util.Stack;

public class Manipulate {
    public static void main(String[] args) {
        Stack s = new Stack<>();
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println(s);
        System.out.println(s.peek());
        s.pop();

        s.pop();
        System.out.println(s);




    }
}
