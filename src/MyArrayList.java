import java.util.ArrayList;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
            System.out.println(list);

        list.add(1, "Fifth");
        System.out.println("-----------");
            System.out.println(list);

        System.out.println("-----------");
        System.out.println(list.get(1));

        System.out.println("-----------");
        System.out.println(list.remove(2));

        System.out.println("-----------");
        System.out.println(list.size());

        System.out.println("-----------");
        list.clear();
        System.out.println(list);
        }

    }
