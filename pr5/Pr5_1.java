import java.util.*;

interface Exam {
    boolean isPassed(int mark);
}

interface Classify {
    String getDivision(double average);
}

class Result implements Exam, Classify {
    public boolean isPassed(int mark) {
        return mark >= 40;
    }

    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else if (average >= 50) {
            return "Second Division";
        } else if (average >= 40) {
            return "Third Division";
        } else {
            return "Fail";
        }
    }
}

public class Pr5_1 {
    public static void main(String[] args) {
        System.out.println("Name: Jwalin Enr: 250413107015");

        Result res = new Result();
        int marks = 65;
        double avg = 72.5;

        System.out.println("Marks obtained: " + marks);
        if (res.isPassed(marks)) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }

        System.out.println("Average: " + avg);
        System.out.println("Division: " + res.getDivision(avg));
    }
}
