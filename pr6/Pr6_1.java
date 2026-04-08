import java.util.*;

public class Pr6_1 {
    public static void main(String[] args) {
        System.out.println("Name:_ Enr:_ ");
        
        try {
            double numerator = Double.parseDouble(args[0]);
            double denominator = Double.parseDouble(args[1]);

            double result = numerator / denominator;
            System.out.println("Numerator: " + numerator);
            System.out.println("Denominator: " + denominator);
            System.out.println("Result of division: " + result);

        } catch (ArrayIndexOutOfBoundsException e) {
            //for missing command-line arguments
            System.out.println("Error: Please provide exactly two numbers as command-line arguments.");
        } catch (NumberFormatException e) {
            //for non-integer inputs
            System.out.println("Error: Please enter valid integer numbers only.");
        } catch (ArithmeticException e) {
            //division by zero
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            //misc
            System.out.println("An unexpected error occurred: " + e);
        }
    }
}