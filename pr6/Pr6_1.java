public class Pr6_1 {
    public static void main(String[] args) {
        System.out.println("Name:_ Enr:_ ");
        
        try {
            if (args.length < 2) {
                throw new IllegalArgumentException("Please provide numerator and denominator as command-line arguments.");
            }

            double numerator = Double.parseDouble(args[0]);
            double denominator = Double.parseDouble(args[1]);

            double result = numerator / denominator;
            System.out.println("Numerator: " + numerator);
            System.out.println("Denominator: " + denominator);
            System.out.println("Result of division: " + result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Please provide exactly two numbers as command-line arguments.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numeric values only.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e);
        }
    }
}