import java.util.*;

public class Pr1_1{
	public static void main(String [] args){
		int distance;
		double feet;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter distance in meters: ");
		distance = sc.nextInt();

		feet = distance * 3.28084;

		System.out.println("Distance in feet is " + feet);
	}
}

		
	
