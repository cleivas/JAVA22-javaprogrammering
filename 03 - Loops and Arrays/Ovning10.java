package loopsOvningar;

public class Ovning10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = {"Ida", "Clara", "Kelly", "Jimmy", "Björn", "Sebastian", "Kaj", "Max", "Tim", "Kim"};
		//int[] amounts = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] amounts = new int[10];
		
		
		for(int i=0; i<15; i++) {
			int index = (int) (Math.random()*names.length);
			System.out.println(names[index]);
			amounts[index]++;
		}
		System.out.println("The amount of times the names were printed: ");
		for(int i = 0; i<names.length; i++) {
			if(amounts[i] > 0) {
				System.out.println(names[i] + " - " + amounts[i]);
			}
		}
	}

}
