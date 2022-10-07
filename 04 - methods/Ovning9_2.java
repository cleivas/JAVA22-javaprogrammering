package ovning9;

import java.util.Scanner;

public class Ovning9_2 {

	public static void main(String[] args) {
		//Scanner för att ta emot input från konsolen
		Scanner s = new Scanner(System.in);
		
		//Kommer loopa för alltid
		while(true) {
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
					int[] argArrayAv = createArray(rangeAv, s);

					System.out.println(average(argArrayAv));
					break;
					
					//Om användaren valt 3 kommer vi fråga efter hur många unmmer som användaren vill mata in
				case 3:
					System.out.println("How many numbers would you like to enter?");
					int rangeMax = s.nextInt();
					
					//Vi skapar en array med lika många element som användaren angett
					int[] argArrayMax = createArray(rangeMax, s);
					
					//Metoden average anropas med argArrayMax som argument
					System.out.println(max(argArrayMax));
					break;
			}
		}
	
	}
	
	//För effektivitetens skull har vi skapat en ny metod för att skapa en array
	//På så sätt behöver vi inte skriva koden för att användaren ska ange en array två gånger som i det första exemplet
	//Eftersom vi vill att användaren ska mata in nummer behöver metoden ha tillgång till scannern, det får den genom en parameter
	
	static int[] createArray(int numberOfElements, Scanner scan) {
		//Arrayen skapas med så många element som användaren angett
		int[] arr = new int[numberOfElements];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("Please enter a number");
			arr[i] = scan.nextInt();
		}
		
		//Arrayen returneras med alla tillagda nummer
		return arr;
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
