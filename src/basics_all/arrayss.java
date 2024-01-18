package basics_all;

import java.util.Arrays;

public class arrayss {
	public static void main(String[] args) {
		int[] arr;
		int arr2[];
			
		arr = new int[10];
		System.out.println(arr[0]);
		
		double[] arr3 = new double[10];
		for(int i = 0; i < 10; i++) {
			arr3[i] = (double)i;
//			System.out.println(arr3[i]);
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(arr3[i]);
		}
		
		System.out.println(Arrays.toString(arr3));
		
		
		int[] arr5 = {3,2,1};
		
		int[][] matrix = {
				{1,2,3,34,11,12},
				{3,4,5,4,0,42,34,12}
		};
		for(int i = 0; i < 2; i++) {
			Arrays.sort(matrix[i]);
			System.out.println(Arrays.toString(matrix[i]));
		}
		
		
		
		
	}

}
