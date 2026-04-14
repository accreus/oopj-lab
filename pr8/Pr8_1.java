import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Pr8_1 {
    public static void main(String[] args) {
        System.out.println("Name:_ Enr:_ ");

        if (args.length < 1) {
            System.out.println("Usage: java Pr8_1 <file-name>");
            return;
        }

        Path filePath = Path.of(args[0]);

        try {
            String content = Files.readString(filePath);
            int characterCount = content.length();
            int wordCount = content.trim().isEmpty() ? 0 : content.trim().split("\\s+").length;
            long lineCount = content.isEmpty() ? 0 : content.chars().filter(character -> character == '\n').count();

            if (!content.isEmpty() && content.charAt(content.length() - 1) != '\n') {
                lineCount++;
            }

            System.out.println("File: " + filePath);
            System.out.println("Characters: " + characterCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Lines: " + lineCount);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}