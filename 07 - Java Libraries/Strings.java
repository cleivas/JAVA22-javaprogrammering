package project;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Clara Leivas was here";
		System.out.println( s.charAt(6) ); 
		
		String s2 = "Leivas";
		System.out.println( s.equals(s2) );
		System.out.println(s2.equals(s));
		
		System.out.println(s.contains(s2));
		System.out.println(s2.contains(s));
		
		
		String b = "Hej";
		String c = "då";
		String d = b.concat(c);
		System.out.println(d);
		
		int x = 456;
		String y = "1234";
		String z = y + String.valueOf(x);
		System.out.println(z);
		z = String.valueOf(x + Integer.parseInt(y));
		System.out.println(z);
	}

}
