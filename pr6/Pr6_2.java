import java.util.*;

class VotingApp {
    public void checkEligibility(int age) {
        if (age < 18) {
            // Explicitly throwing an exception if age is invalid
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        } else {
            System.out.println("Age " + age + ": Eligible to vote.");
        }
    }
}

public class Pr6_2 {
    public static void main(String[] args) {
        System.out.println("Name:_ Enr:_ ");
        
        VotingApp app = new VotingApp();
        
        // Array of different ages to test the method
        int age;
        System.out.println("Enter Age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        
        try {
            app.checkEligibility(age);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        } finally {
            System.out.println("Validation process completed");
        }
        
    }
}