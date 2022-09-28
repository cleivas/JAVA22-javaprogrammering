import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = myScanner.nextLine();
		
		System.out.println("What is your age?");
		int age = myScanner.nextInt();
		myScanner.nextLine();
		
		System.out.println("What is your hobby?");
		String hobby = myScanner.nextLine();
		
		System.out.println("Your name is " + name + " and you're " + age + " years old and your hobby is " + hobby);
				
		myScanner.close();
		System.out.println();
	}

}
