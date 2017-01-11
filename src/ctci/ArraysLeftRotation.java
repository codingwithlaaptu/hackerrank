package ctci;

//https://www.hackerrank.com/challenges/ctci-array-left-rotation

public class ArraysLeftRotation {

	public static void main(String[] args) {

	}

	public static int[] arrayLeftRotation(int[] a, int n, int k) {
		int d = n - k;
		if (d == 0)
			d = k;
		int[] b = new int[n];
		for (int i = 0; i < n; ++i)
			b[(i + d) % n] = a[i];
		return b;
	}

}
