import java.util.ArrayList;

class Box<T> {
    private final ArrayList<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void displayItems() {
        System.out.println(items);
    }
}

public class Pr9_3 {
    public static void main(String[] args) {
        System.out.println("Name:_ Enr:_ ");

        Box<String> nameBox = new Box<>();
        nameBox.addItem("Aarav");
        nameBox.addItem("Diya");
        nameBox.addItem("Rohan");

        Box<Integer> rollNumberBox = new Box<>();
        rollNumberBox.addItem(101);
        rollNumberBox.addItem(102);
        rollNumberBox.addItem(103);

        System.out.println("Names stored in Box<String>:");
        nameBox.displayItems();

        System.out.println("Roll numbers stored in Box<Integer>:");
        rollNumberBox.displayItems();
    }
}