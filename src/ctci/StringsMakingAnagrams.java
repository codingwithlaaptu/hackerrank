package ctci;

import java.util.Arrays;
import java.util.HashMap;

public class StringsMakingAnagrams {
	public static void main(String[] args) {
		// someTest();
		// someMinorTest();
		copiedSolution("ac", "ba");
	}

	/**
	 * 26 alphabets: a- z ascii value of a = 97 and z = 122
	 * 
	 */

	public static void someMinorTest() {
		short s = 32767;
		for (int i = 'a'; i <= 'z'; ++i)
			System.out.println(i);
	}

	// https://goo.gl/7QWl1D
	public static int copiedSolution(String a, String b) {
		int sum = 0, fi = 0, si = 0;
		for (char i = 'a'; i <= 'z'; ++i) {
			fi = a.length() - a.replaceAll(String.valueOf(i), "").length();
			si = b.length() - b.replaceAll(String.valueOf(i), "").length();
			sum += Math.abs(fi - si);
		}
		System.out.println(sum);
		return sum;
	}

	public static void someTest() {
		char[] charA = StringsMakingAnagramsTest.str0.toCharArray();
		char[] charB = StringsMakingAnagramsTest.str00.toCharArray();
		Arrays.sort(charA);
		Arrays.sort(charB);
		String a = String.valueOf(charB);
		String b = String.valueOf(charA);
		System.out.println(a);
		System.out.println(b);
		System.out.println(naiveHashSolution(a, b));
	}

	public static int naiveSolution(String a, String b) {
		int lenA = a.length();
		int lenB = b.length();
		int count = 0;
		char[] charA = a.toCharArray();
		char[] charB = b.toCharArray();
		for (int i = 0; i < lenA; ++i) {
			for (int j = 0; j < lenB; ++j) {
				if (charA[i] == charB[j]) {
					++count;
					charB[j] = '0';
					break;
				}
			}
		}
		return (lenA + lenB - count * 2);
	}

	// https://goo.gl/mP5SFz
	public static int hashSimplified(String a, String b) {
		int[] map = new int[26];
		int lenA = a.length(), lenB = b.length();
		for (int i = 0; i < lenA; ++i) {
			map[a.charAt(i) - 'a']++;
		}
		int index = 0, count = 0;
		for (int i = 0; i < lenB; ++i) {
			index = b.charAt(i) - 'a';
			if (map[index] > 0) {
				count++;
				map[index]--;
			}
		}
		count = lenA + lenB - count * 2;
		// System.out.println(count);
		return count;
	}

	public static int naiveHashSolution(String a, String b) {
		char[] charA = a.toCharArray();
		char[] charB = b.toCharArray();
		int lenA = charA.length;
		int lenB = charB.length;
		HashMap<Character, Integer> someHashMap = new HashMap<>();
		for (int i = 0; i < lenA; ++i) {
			char c = charA[i];
			if (someHashMap.get(c) != null) {
				int val = someHashMap.get(c);
				someHashMap.put(c, ++val);
			} else {
				someHashMap.put(c, 1);
			}
		}

		int count = 0;
		for (int i = 0; i < lenB; ++i) {
			char c = charB[i];
			if (someHashMap.get(c) != null) {
				int val = someHashMap.get(c);
				if (val > 0) {
					++count;
					someHashMap.put(c, --val);
				}
			}
		}

		return (lenA + lenB - count * 2);
	}

}
