package methods;

import java.util.Scanner;

public class Arguments {

	public static void main(String[] args) {
		numberOfDogs(5, "Staff");
		numberOfDogs(10, "Pitbull");
		sayHej(5);
		System.out.println("_______");
		
		System.out.println("Hur många gånger vill du säga hej?");
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		sayHej(input);
		
		s.close();
	}
	
	static void numberOfDogs(int amount, String race) {
		System.out.println("The amount of " + race + "s is " + amount);
	}
	
	//En metod med en integer som parameter
	//integern ska bestämma hur många gånger något printas
	//"Hej hej!"
	
	static void sayHej(int times) {
		for(int i=0; i<times; i++) {
			System.out.println("Hej, hej!");
		}
	}
}
