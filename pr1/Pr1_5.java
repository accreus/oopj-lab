import java.util.*;

public class Pr1_5 {
    public static void main(String[] args) {
        System.out.println("Name: Jwalin Enr: 250413107015");
        
        if (args.length < 2) {
            System.out.println("Please provide exactly two numbers as command-line arguments.");
            return;
        }

        // Converting string arguments to double
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);

        // Performing sum and product
        double sum = num1 + num2;
        double product = num1 * num2;

        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Sum is: " + sum);
        System.out.println("Product is: " + product);
    }
}
