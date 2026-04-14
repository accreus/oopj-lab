import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pr8_2 {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        System.out.println("Name:_ Enr:_ ");

        if (args.length < 2) {
            System.out.println("Usage:");
            System.out.println("  copy <source> <destination>");
            System.out.println("  delete <file>");
            System.out.println("  rename <source> <destination>");
            return;
        }

        String command = args[0].toLowerCase();

        try {
            switch (command) {
                case "copy":
                    if (args.length < 3) {
                        throw new IllegalArgumentException("Copy requires source and destination.");
                    }
                    copyFile(args[1], args[2]);
                    printFileProperties(new File(args[2]));
                    break;
                case "delete":
                    deleteFile(args[1]);
                    printFileProperties(new File(args[1]));
                    break;
                case "rename":
                    if (args.length < 3) {
                        throw new IllegalArgumentException("Rename requires source and destination.");
                    }
                    renameFile(args[1], args[2]);
                    printFileProperties(new File(args[2]));
                    break;
                default:
                    System.out.println("Unknown command: " + command);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }
    }

    private static void copyFile(String source, String destination) throws IOException {
        Path sourcePath = Path.of(source);
        Path destinationPath = Path.of(destination);

        if (!Files.exists(sourcePath)) {
            throw new FileNotFoundException(source);
        }

        Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File copied successfully.");
    }

    private static void deleteFile(String fileName) throws IOException {
        Path filePath = Path.of(fileName);

        if (!Files.exists(filePath)) {
            throw new FileNotFoundException(fileName);
        }

        Files.delete(filePath);
        System.out.println("File deleted successfully.");
    }

    private static void renameFile(String source, String destination) throws IOException {
        Path sourcePath = Path.of(source);
        Path destinationPath = Path.of(destination);

        if (!Files.exists(sourcePath)) {
            throw new FileNotFoundException(source);
        }

        Files.move(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File renamed successfully.");
    }

    private static void printFileProperties(File file) {
        System.out.println("File name: " + file.getName());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("File size (bytes): " + file.length());
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Last modified: " + (file.exists() ? DATE_FORMAT.format(new Date(file.lastModified())) : "N/A"));
        System.out.println("Exists: " + file.exists());
    }
}