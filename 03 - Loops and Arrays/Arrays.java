package loopsArrays;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Array of Strings");
		String[] trees = {"Oak", "Birch", "Asp", "Redwood", "Pine", "", "" };
		System.out.println(trees[5]);
		
		trees[0] = "Apple";
		System.out.println(trees[0]);
		
		trees[6] = String.valueOf(4.5);
		System.out.println(trees[6]);
		
		System.out.println("_________");
		for(int i=0; i<trees.length; i++) {
			System.out.println(trees[i]);
		}
		
		System.out.println("_________");
		System.out.println("Loop with less code");
		for(String tree : trees) {
			System.out.println(tree);
		}
		
		System.out.println("_________");
		System.out.println("Array of ints");
		int[] numbers = {4, 346, 12, 35746, 3, 8};
		int sum = 0;
		for(int num : numbers) {
			System.out.println(num);
			sum = sum + num;
			//sum+=num;
		}
		System.out.println("The sum of all ints: " + sum );
		
		System.out.println("_________");
		System.out.println("Length of String");
		String namn = "Clara";
		System.out.println(namn.length());
	}

}
