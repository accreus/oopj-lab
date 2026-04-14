class VotingApp {
    public void checkEligibility(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        }

        System.out.println("Age " + age + ": Eligible to vote.");
    }
}

public class Pr6_2 {
    public static void main(String[] args) {
        System.out.println("Name:_ Enr:_ ");
        
        VotingApp app = new VotingApp();

        int[] testAges = {16, 18, 25};

        for (int age : testAges) {
            try {
                System.out.println("Testing age: " + age);
                app.checkEligibility(age);
            } catch (IllegalArgumentException e) {
                System.out.println("Exception Caught: " + e.getMessage());
            } finally {
                System.out.println("Validation process completed");
            }
        }
    }
}