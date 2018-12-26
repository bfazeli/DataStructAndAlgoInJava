package ds.quadraticsortingalgorithms;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int [] {12, 10, 4, 2, 8, 9};
		
		System.out.println(Arrays.toString(insertionSort(arr)));
	}

	private static int[] insertionSort(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i < arr.length; ++i) {
			int current = arr[i];
			
			int j = i - 1;
			
			while(j >= 0 && arr[j] > current) {
				arr[j + 1] = arr[j];
				--j;
			}
			
			arr[j + 1] = current;
		}
		
		return arr;
	}

}
