import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Ivan");
        list.add("Petro");
        list.add("Fedor");
       for (String node : list) {
            System.out.println(node);
        }
        System.out.println("-----------");
        System.out.println(list.size());
        System.out.println("-----------");

        list.remove("Ivan");
        for (String node : list) {
            System.out.println(node);
        }
        System.out.println("-----------");
        System.out.println(list.get(0));
        list.remove(1);
        System.out.println("-----------");
        list.clear();
        System.out.println(list);
    }
}