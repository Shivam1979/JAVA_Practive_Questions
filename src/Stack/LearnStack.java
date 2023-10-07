package Stack;

import java.util.Stack;

public class LearnStack {

    //LIFO


    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("dog");
        animals.push("cat");
        animals.pop();
        animals.search("cat");
        System.out.println(animals.peek());
    }
}