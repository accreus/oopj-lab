import java.util.*;

public class Atm{
	public static void main(String[] args){
		System.out.println("Name:_ Enr:_ ");
		
		int[] arr = {100, 50, 10, 5, 2, 1};
		int[] notes = new int[arr.length];
		int amount;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter amount");
		amount = sc.nextInt();

		for(int i=0; i<arr.length; i++){
			int quotient = amount/arr[i];
			amount = amount%arr[i];
			notes[i] = quotient;
		}

		System.out.println("Notes required are:");

		for(int i=0; i<arr.length; i++){
			System.out.println(notes[i] + " notes of " + arr[i]);
		}
	}
}
