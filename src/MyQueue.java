import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Marina");
        queue.add("Veronika");
        queue.add("Anna");
        queue.add("Victoria");
        System.out.println("Before changed "+ queue);

        queue.add("Anastasiya");
        System.out.println("After changed "+ queue);

        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue);

        String poll = queue.poll();
        System.out.println(poll+ " " + queue);
        System.out.println(queue);

        queue.clear();
        System.out.println(queue);

    }
}
