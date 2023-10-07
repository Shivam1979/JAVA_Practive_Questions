package Collection.Arraylist.Stack;

import java.util.Stack;

public class PushPop {

    /**
     * 83. If the sequence of operations - push (1), push (2), pop, push (1),
     * push (2), pop, pop, pop, push (2), pop are performed on a stack,
     * the sequence of popped out values

     */
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.pop();
         ///                       order of pooping out  2
        stack.push(1);
        stack.push(2);
        stack.pop();
        ///                       order of pooping out  2  ,1
        stack.pop();
        ///                       order of pooping out  2  ,1 , 2
        stack.pop();
        ///                       order of pooping out  2  ,1 , 2 , 1
        stack.push(2);
        // now only item 2 is remainig in the stack and print
        System.out.println(stack);


    }
}
