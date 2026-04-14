import java.util.*;

class Rectangle {
    double width;
    double height;

    // No-argument constructor
    Rectangle() {
        width = 1.0;
        height = 1.0;
    }

    // Parameterized constructor
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }
}

public class Pr2_1 {
    public static void main(String[] args) {
        System.out.println("Name:_ Enr:_ ");
        
        Rectangle r1 = new Rectangle();
        System.out.println("Default Rectangle - Area: " + r1.getArea() + ", Perimeter: " + r1.getPerimeter());

        Rectangle r2 = new Rectangle(5.5, 4.0);
        System.out.println("Parameterized Rectangle - Area: " + r2.getArea() + ", Perimeter: " + r2.getPerimeter());
    }
}