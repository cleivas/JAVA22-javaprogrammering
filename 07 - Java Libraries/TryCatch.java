package project;

public class TryCatch {
	public static void main(String[] args) {
		int[] a = {3, 56, 23, 4};
		int index = 10;
		
		try {
			System.out.println(a[index]);
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("Något gick fel");
//			System.exit(0);
		}
		
		System.out.println("Det här kommer efter a[index]");
	}
}
