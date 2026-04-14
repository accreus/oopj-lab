import java.util.ArrayList;
import java.util.Collections;

public class Pr9_1 {
    public static void main(String[] args) {
        System.out.println("Name:_ Enr:_ ");

        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(78);
        marks.add(92);
        marks.add(65);
        marks.add(88);
        marks.add(74);

        System.out.println("Marks: " + marks);
        System.out.println("Highest mark: " + Collections.max(marks));
        System.out.println("Lowest mark: " + Collections.min(marks));
    }
}