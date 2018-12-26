package ds.binarysearch;

public class RecursiveLinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(recLinearSearch(new int[] {2, 8, 10, 7, 5}, 0, 5));
	}
	
	public static int recLinearSearch(int[] a, int i, int x) {
		// Base case
		if (i > a.length - 1) return -1;
		else if (a[i] == x) return i;
		else return recLinearSearch(a, i + 1, x);
	}

}
