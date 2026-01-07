import java.util.*;

public class Bmi{
	public static void main(String[] args){
		System.out.println("Name:_ Enr:_ ");
		
		double pound, inch, kg, meter, bmi;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter weight in pounds");
		pound = sc.nextDouble();
		
		System.out.println("Enter height in inches");
		inch = sc.nextDouble();

		kg = pound * 0.45359237;
		meter = inch * 0.0254;

		bmi = (kg/(meter * meter));

		System.out.println("BMI of person is :" + bmi);
	}
}
