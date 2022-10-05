package methods;

public class Metod {

	public static void main(String[] args) {
		printInOut();
	}
	
	static void printOut() {
		System.out.println("OUT");
	}
	
	static void printIn() {
		System.out.println("IN");
	}
	
	static void printInOut() {
		printIn();
		printOut();
	}

}
