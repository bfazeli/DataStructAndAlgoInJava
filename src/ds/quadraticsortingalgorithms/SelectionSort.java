package ds.quadraticsortingalgorithms;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int [] arr = new int [] {1, 10, 4, 2, 8, 9};
		
		System.out.println(Arrays.toString(selectionSort(arr)));
	}

	private static int[] selectionSort(int a []) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < a.length; ++i) {
			int minimum = i;
			for(int j = i + 1; j < a.length; ++j) {
				if (a[j] < a[minimum]) {
					minimum = j;
				}
			}
			
			int temp = a[i];
			a[i] = a[minimum];
			a[minimum] = temp;
		}
		
		return a;
	}

}
