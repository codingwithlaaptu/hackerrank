package algorithms.implementation;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/kangaroo
public class Kangaroo {

	public static void main(String[] args) {
		// takeInput();
		System.out.println(4 % 1);
	}

	public static void takeInput() {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();
		System.out.println(doTheyMeet(x1, v1, x2, v2));
		in.close();
	}

	// looked from implementation of others
	public static String doTheyMeet(int x1, int v1, int x2, int v2) {
		if (x1 < x2 && v1 > v2) {
			return (x2 - x1) % (v1 - v2) == 0 ? "YES" : "NO";
		} else if (x2 < x1 && v2 > v1) {
			return (x1 - x2) % (v2 - v1) == 0 ? "YES" : "NO";
		}
		return x1 == x2 && v1 == v2 ? "YES" : "NO";
	}

	// my naive implementation
	public static String doTheyMeetInFuture(int x1, int v1, int x2, int v2) {
		if ((x1 <= x2 && v1 > v2) || (x2 <= x1 && v2 > v1)) {
			int maxCount = 0, pos1 = x1 + v1, pos2 = x2 + v2;
			while (maxCount <= 1000) {
				if (pos1 == pos2)
					return "YES";
				pos1 += v1;
				pos2 += v2;
			}

		}
		return x1 == x2 && v1 == v2 ? "YES" : "NO";
	}

	static int gcd(int x, int y) {
		int r = 0, a, b;
		a = (x > y) ? x : y; // a is greater number
		b = (x < y) ? x : y; // b is smaller number

		r = b;
		while (a % b != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		return r;
	}

	static int lcm(int x, int y) {
		int a;
		a = (x > y) ? x : y; // a is greater number
		while (true) {
			if (a % x == 0 && a % y == 0)
				return a;
			++a;
		}
	}

}
