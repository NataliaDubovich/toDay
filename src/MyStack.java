import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Pear");
        stack.push("Cherry");
        stack.push("Watermelon");
        System.out.println("Original array "+stack);

        System.out.println(stack.push("Orange"));
        System.out.println("Change array "+stack);

        System.out.println(stack.remove(2));
        System.out.println(stack);

        System.out.println(stack.size());

        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack);

        stack.clear();
        System.out.println(stack);

    }
}
