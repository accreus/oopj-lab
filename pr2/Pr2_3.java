import java.util.*;

class Point{
    int x, y;
    
    // Default constructor
    Point(){
        x = 5;
        y = 5;
    }

    // Parameterized Constructor
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }

    public void display(){
        System.out.printf("Point Coordinates are: (%d, %d)", x, y);
        System.out.println();
    }
}

public class Pr2_3{
    public static void main(String[] args){
        Point p1 = new Point();
        p1.display();

        Point p2 = new Point(5, 10);
        p2.display();

        System.out.println("Below point is a copy point");
        Point p3 = new Point(p2);
        p3.display();
    }
}
