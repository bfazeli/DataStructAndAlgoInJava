package ds.binarysearch;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(binarySearch(new int [] {1, 2, 3, 4, 7}, 8));
	}
	
	public static int binarySearch(int [] a, int x) {
		
		int p = 0;				// Beginning of the range
		int r = a.length - 1;	// End of the range
		int q;					// Mid
		
		// Do the following while there exists at least one element
		while (p <= r) {
			q = (p + r) / 2;
			if (a[q] == x) {
				return q;
			} else if (a[q] < x) {
				// Consider only right most half of q
				p = q + 1;
			} else {
				// Consider only left most half of q
				r = q - 1;
			}
		}
		
		return -1;
	}

}
