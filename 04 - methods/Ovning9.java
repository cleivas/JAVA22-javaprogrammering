package ovning9;

import java.util.Scanner;

public class Ovning9 {

	public static void main(String[] args) {
		//Scanner för att ta emot input från konsolen
		Scanner s = new Scanner(System.in);
		
		//Kommer loopa för alltid
		while(true) {
			//Vi printar menyn
			System.out.println("1. Addition");
			System.out.println("2. Average");
			System.out.println("3. Max value");
			
			//Vi tar emot användarens input, alltså valet från menyn
			int choice = s.nextInt();
			System.out.println("You have chosen " + choice);
			
			//Vi använder ett switch-case för att välja vad som ska hända beroende på användarens val
			switch(choice) {
			
				//Om användaren valt 1 kommer vi fråga efter två heltal som sparas ner i variablerna x och y
				case 1: 
					System.out.println("Enter the first integer:");
					int x = s.nextInt();
					System.out.println("Enter the second integer:");
					int y = s.nextInt();
					//Vi anropar metoden addition med x och y som argument
					System.out.println(addition(x, y));
					break;
					
				//Om användaren valt 2 kommer vi fråga efter hur många unmmer som användaren vill mata in
				case 2:
					System.out.println("How many numbers would you like to enter?");
					int rangeAv = s.nextInt();
					
					//Vi skapar en array med lika många element som användaren angett
					int[] argArrayAv = new int[rangeAv];
					
					//Vi loopar igenom arrayen och sparar ner varje nummer som användaren anger
					for(int i=0; i<argArrayAv.length; i++) {
						System.out.println("Please enter a number");
						argArrayAv[i] = s.nextInt();
					}
					//Metoden average anropas med argArrayAv som argument
					System.out.println(average(argArrayAv));
					break;
					
					//Om användaren valt 3 kommer vi fråga efter hur många unmmer som användaren vill mata in
				case 3:
					System.out.println("How many numbers would you like to enter?");
					int rangeMax = s.nextInt();
					
					//Vi skapar en array med lika många element som användaren angett
					int[] argArrayMax = new int[rangeMax];
					
					//Vi loopar igenom arrayen och sparar ner varje nummer som användaren anger
					for(int i=0; i<argArrayMax.length; i++) {
						System.out.println("Please enter a number");
						argArrayMax[i] = s.nextInt();
					}
					
					//Metoden average anropas med argArrayMax som argument
					System.out.println(max(argArrayMax));
					break;
			}
			
			
		}
		
	}
	
	static int addition(int x, int y) {
		return x+y;
	}
	
	static double average(int[] array) {
		double sum = 0;	
		for(int i=0; i<array.length; i++) {
			//sum +=array[i];
			sum = sum + array[i];
		}
		return sum/array.length;
	}
	
	static int max(int[] array) {
		int highest = 0;
	
		//Resultatet av den här for-loopen är samma som i average-metoden.
		for(int element : array) {
			if(element>highest) {
				highest = element;
			}
		}
		return highest;
	}

}
