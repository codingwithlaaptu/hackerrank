package algorithms.warmup;
import java.util.Scanner;

public class CompareTheTriplets {

	// https://www.hackerrank.com/challenges/compare-the-triplets

	public static void main(String[] args) {
		takeInput();
	}

	public static void takeInput() {
		Scanner in = new Scanner(System.in);
		int a0 = in.nextInt();
		int a1 = in.nextInt();
		int a2 = in.nextInt();
		int b0 = in.nextInt();
		int b1 = in.nextInt();
		int b2 = in.nextInt();
		compareTheScore(new int[] { a0, a1, a2 }, new int[] { b0, b1, b2 });
		in.close();

	}

	public static void compareTheScore(int[] aliceScore, int[] bobScore) {
		int aliceTotal = 0, bobTotal = 0;
		for (int i = 0, length = aliceScore.length; i < length; ++i) {
			if (aliceScore[i] > bobScore[i])
				++aliceTotal;
			else if (aliceScore[i] < bobScore[i])
				++bobTotal;
		}
		System.out.println(aliceTotal + " " + bobTotal);

	}

}
