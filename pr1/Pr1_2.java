import java.util.*;

public class Pr1_2{
	public static void main(String[] args){
		System.out.println("Name:_ Enr:_ ");
		
		int a, b, c, d, e, f;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter variables from a to f: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		f = sc.nextInt();

		int determinant = (a*d) - (b*c);
		
		if(determinant == 0){
			System.out.println("Determinant is zero, therefore equation has no unique solution");
		}
		else {
			int dx = (e*d) - (b*f);
			int dy = (f*a) - (e*c);
			
			int x = dx/determinant;
			int y = dy/determinant;
			
			System.out.println("x = " + dx);
			System.out.println("y = " + dy);
		}
	}
}

