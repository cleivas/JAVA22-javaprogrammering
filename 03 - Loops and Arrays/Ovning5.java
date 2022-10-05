package loopsOvningar;

public class Ovning5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int random = (int) Math.round( Math.random()*100 ); 
		
		while(random < 53 || random > 67 ){
			
			System.out.println(random);
			random = (int) Math.round( Math.random()*100 ); 
			
		}
	}

}
