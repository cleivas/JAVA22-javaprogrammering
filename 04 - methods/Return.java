package methods;

public class Return {

	public static void main(String[] args) {
		int result = multiply(6, 9);
		System.out.println(result);
		
		result = multiply(325, 245);
		System.out.println(result);
		
		double resultD = divide(3, 5);
		System.out.println(resultD);
		
		boolean resultIsOdd = isOdd(6);
		System.out.println(resultIsOdd);
		
	}
	
	static boolean isOdd(int x) {
//		if(x%2 == 1) {
//			return true;
//		}
//		else {
//			return false;
//		}
		return (x%2 == 1);
	}
	
	static int multiply(int x, int y ) {
		return x*y;
	}
	
	static double divide(double x, double y) {
		return x/y;
	}

}
