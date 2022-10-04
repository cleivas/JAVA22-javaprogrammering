package loopsArrays;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("En for loop som räknar uppåt");
		int number = 10;
		for(int i=0; i<10; i++) {
			number+=i;
			//Same result as above: number = number+i;
			System.out.println(number);
		}
		
		System.out.println();
		System.out.println("En for loop som räknar neråt");
		for(int i=22; i>9; --i) {
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println("En for loop som räknar 5 i taget");
		for(int j=0; j<50; j+=5) {
			System.out.println(j);
		}
		
		System.out.println();
		System.out.println("En for loop där användaren får bestämma antal loopar.");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number:");
		int input = s.nextInt();
		
		for(int i=0; i<input; i++) {
			System.out.println(i+1);
		}
		
		s.close();
	}

}
