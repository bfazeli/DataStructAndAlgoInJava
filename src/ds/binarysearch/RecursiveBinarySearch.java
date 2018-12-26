package ds.binarysearch;

public class RecursiveBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(recBinarySearch(new int [] {1, 3, 10, 24, 30, 42, 57}, 0, 6, 10));
	}

	private static int recBinarySearch(int[] a, int p, int r, int x) {
		// Base case
		if(p > r) return -1;
		
		int q = (p + r) / 2;
		
		if (a[q] == x) return q;
		else if (a[q] > x) return recBinarySearch(a, p, q-1, x);
		else return recBinarySearch(a, q+1, r, x);
	}

}
