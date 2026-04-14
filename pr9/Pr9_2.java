import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Pr9_2 {
    public static void main(String[] args) {
        System.out.println("Name:_ Enr:_ ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        Map<String, Integer> frequency = new HashMap<>();
        List<String> order = new ArrayList<>();

        for (String word : sentence.trim().split("\\s+")) {
            if (word.isEmpty()) {
                continue;
            }

            if (!frequency.containsKey(word)) {
                order.add(word);
            }

            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        for (String word : order) {
            System.out.println(word + " -> " + frequency.get(word));
        }
    }
}