package loopsArrays;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Följande visar stegen för att generera ett random heltal från 0 till 10.");
		double randD = Math.random();
		System.out.println(randD);
		
		double randDTen = randD *10;
		System.out.println(randDTen);
		
		long round = Math.round(randDTen);
		System.out.println(round);
		
		int roundInt = (int)round;
		System.out.println(roundInt);
		
		System.out.println();
		System.out.println("While loopen loopas sålänge rand inte är lika med 5");
		int rand = 0;
		while(rand != 5) {
			rand = (int) Math.round(Math.random()*10);
			System.out.println(rand);
		}
		
		System.out.println();
		System.out.println("While loopar går att använda som for loopar då vi vet hur många gånger den ska loopa");
		int i = 0;
		while(i<10) {
			i++;
			System.out.println(i);
		}

		System.out.println();
		System.out.println("Följande visar skillnaden på while och do while");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int input = s.nextInt();
//		while(input != 5) {
//			System.out.println("Testa igen:");
//			input = s.nextInt();
//		}
		do {
			System.out.println("Testa igen:");
			input = s.nextInt();
		}while(input!=5);
		
		s.close();
	}

}
