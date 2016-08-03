package algorithms.warmup;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/circular-array-rotation

public class CircularArrayRotation {

	public static void main(String[] args) {
		takeInput();
	}

	public static void takeInput() {
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		int shift = in.nextInt();
		int query = in.nextInt();

		int arr[] = new int[length];
		for (int i = 0; i < length; ++i)
			arr[i] = in.nextInt();
		int[] queries = new int[query];
		for (int i = 0; i < query; ++i) {
			queries[i] = in.nextInt();
		}
		initCircularRotation(shift, arr, queries);
		in.close();
	}

	public static void initCircularRotation(int shift, int[] arr, int[] queries) {
		int length = arr.length;
		int remainder = shift % length;
		if (remainder == 0) {
			printValues(arr, queries);
			return;
		}
		int[] shiftedArr = new int[length];
		int newIndex = 0;
		for (int i = 0; i < length; ++i) {
			newIndex = (i + remainder) % length;
			shiftedArr[newIndex] = arr[i];
		}
		arr = shiftedArr;
		printValues(arr, queries);
	}

	public static void printValues(int[] arr, int[] queries) {
		for (int i = 0, length = queries.length; i < length; ++i) {
			System.out.println(arr[queries[i]]);
		}
	}

}
