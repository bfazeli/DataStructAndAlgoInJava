package ds.quadraticsortingalgorithms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = new int [] {1, 10, 4, 2, 8, 9};
		
		System.out.println(Arrays.toString(bubbleSort(arr)));
	}

	private static int[] bubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i = 0; i < arr.length - 1; ++i) {
			for(int j = 0; j < arr.length - 1 - i; ++j) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		return arr;
	}

}
