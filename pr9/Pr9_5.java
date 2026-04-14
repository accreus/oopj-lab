import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pr9_5 {
    public static <T extends Comparable<T>> void sortList(List<T> list) {
        Collections.sort(list);
    }

    public static void main(String[] args) {
        System.out.println("Name:_ Enr:_ ");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(12);
        numbers.add(89);
        numbers.add(31);

        ArrayList<String> names = new ArrayList<>();
        names.add("Zara");
        names.add("Aman");
        names.add("Kiran");
        names.add("Bhavya");

        System.out.println("Numbers before sorting: " + numbers);
        sortList(numbers);
        System.out.println("Numbers after sorting:  " + numbers);

        System.out.println("Names before sorting: " + names);
        sortList(names);
        System.out.println("Names after sorting:  " + names);
    }
}