
public class IfStatements{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 35;
//		if(age<20) {
//			System.out.println("Varsågod och köp mjölk på ICA");
//			if(age == 16) {
//				System.out.println("SWEET 16!");
//			}
//		}
//		else if(age >= 20 && age < 65) {
//			System.out.println("Välkomen in på systemet!");
//		}
//		else {
//			System.out.println("Ring ditt barnbarn");
//		}
		
		if(age < 20 ) {
			System.out.println("Varsågod och köp mjölk på ICA");
		}
		else if( age > 65 ) {
			System.out.println("Ring ditt barnbarn");
		}
		else {
			System.out.println("Varsågod kom på systemet");
		}
	}
}
