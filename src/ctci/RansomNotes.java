package ctci;

import java.util.ArrayList;
import java.util.HashMap;

public class RansomNotes {

	static String strip0 = "give me one grand today night";
	static String ransomeNote0 = "give one grand today";
	static boolean op0 = true;

	public static void main(String[] args) {
		// canRansomNoteBeMade("Hello how are you doing ", "How great");
		// canRansomNoteBeMade(strip0, ransomeNote0);
	}

	public static void someTest() {
		int a = 10, b = 2;
		int combinedNum = maskTwoNumber(a, b);
		System.out.println(combinedNum);
		int[] num = unmaskNumber(combinedNum);
		System.out.println(num[0] + " :: " + num[1]);
	}

	public static boolean canRansomNoteBeMade(String strip, String ransom) {
		String[] words = strip.split("\\s");
		int length = words.length;
		HashMap<String, Integer> stripHash = new HashMap<>();
		for (int i = 0; i < length; ++i) {
			int occurence = 1;
			if (stripHash.get(words[i]) != null) {
				occurence = stripHash.get(words[i]);
				++occurence;
			}
			stripHash.put(words[i], occurence);
		}
		String[] ransomWords = ransom.split("\\s");
		boolean ransomNote = true;
		for (int i = 0; i < ransomWords.length; ++i) {
			if (stripHash.get(ransomWords[i]) != null) {
				int occurence = stripHash.get(ransomWords[i]);
				if (occurence > 0) {
					stripHash.put(ransomWords[i], --occurence);
					continue;
				}
			}
			ransomNote = false;
			break;
		}
		return ransomNote;
	}

	public static boolean canRansomNoteBeMade2(String strip, String ransom) {
		String[] words = strip.split("\\s");
		int length = words.length;
		HashMap<String, ArrayList<Integer>> stripHash = new HashMap<>();
		for (int i = 0; i < length; ++i) {
			ArrayList<Integer> indexList = new ArrayList<Integer>();
			if (stripHash.get(words[i]) != null) {
				indexList = stripHash.get(words[i]);
			}
			indexList.add(i);
			stripHash.put(words[i], indexList);
		}
		String[] ransomWords = ransom.split("\\s");
		boolean ransomNote = true;
		int order = 0;
		for (int i = 0; i < ransomWords.length; ++i) {
			if (stripHash.get(ransomWords[i]) != null) {
				ArrayList<Integer> indexList = stripHash.get(ransomWords[i]);
				int index = indexList.get(0);
				// if (index >= order) {
				order = index;
				indexList.remove(0);
				if (indexList.size() == 0)
					stripHash.put(ransomWords[i], null);
				continue;
				// }
			}
			ransomNote = false;
			break;
		}
		return ransomNote;
	}

	public static boolean canRansomNoteBeMade1(String strip, String ransom) {
		String[] words = strip.split("\\s");
		int length = words.length;
		HashMap<String, Integer> stripHash = new HashMap<>();
		for (int i = 0; i < length; ++i) {
			stripHash.put(words[i], i);
		}
		String[] ransomWords = ransom.split("\\s");
		boolean ransomNote = true;
		int order = 0;
		for (int i = 0; i < ransomWords.length; ++i) {
			if (stripHash.get(ransomWords[i]) != null) {
				int index = stripHash.get(ransomWords[i]);
				if (index >= order) {
					order = index;
					continue;
				}
			}
			ransomNote = false;
			break;
		}
		return ransomNote;
	}

	public static int maskTwoNumber(int index, int occurence) {
		return (index | occurence << 16);
	}

	public static int[] unmaskNumber(int a) {
		// int1 is stored in the bottom half of x, so take just that part.
		int index = a & 0xFFFF;

		// int2 is stored in the top half of x, so slide that part of the number
		// into the bottom half, and take just that part.
		int occurence = (a >> 16) & 0xFFFF;
		int[] values = new int[2];
		values[0] = index;
		values[1] = occurence;
		return values;
	}

}
