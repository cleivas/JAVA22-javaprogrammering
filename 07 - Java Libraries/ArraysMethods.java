package project;

import java.util.Arrays;

public class ArraysMethods {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3};
		int[] arr2 = arr1;
		
		System.out.println(Arrays.toString(arr1) );
		System.out.println(Arrays.toString(arr2) );
		
		arr1[0] = 9;
		System.out.println(Arrays.toString(arr1) );
		System.out.println(Arrays.toString(arr2) );
		
//		System.out.println(arr1);
//		System.out.println(arr2);
//		
		int[] arr3 = arr2.clone();
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		
		System.out.println(Arrays.toString(arr1) );
		System.out.println(Arrays.toString(arr2) );
		System.out.println(Arrays.toString(arr3) );
		
//		arr2[1] = 70;
		System.out.println(Arrays.toString(arr1) );
		System.out.println(Arrays.toString(arr2) );
		System.out.println(Arrays.toString(arr3) );
		
		System.out.println(arr1==arr2);
		System.out.println(arr1==arr3);
		
	}

}
