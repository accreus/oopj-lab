import java.util.*;

public class Pr1_3
{
	public static void main(String[] args){
		System.out.println("Name:_ Enr:_ ");
		
		char alphabet;
		Scanner sc = new Scanner(System.in);

		alphabet = sc.next().charAt(0);
		char alph = Character.toLowerCase(alphabet);
		

		if(alph == 'a' || alph == 'e' || alph == 'o' || alph == 'i' || alph == 'u'){
			System.out.println(alph + " is a vowel");
		}
		else {
			System.out.println(alph + " is a consonant");
		}
	}
}

