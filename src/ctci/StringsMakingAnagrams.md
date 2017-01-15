Concepts

* Strings are the combination of characters
* "Hello" = H + e + l + l + o
* each character is represented in numeric form i.e. Unicode/ASCII values, a = 97 and z = 122
* One interesting question to ponder upon is that how a program distinguises a number say integer from a character c, as during storing and retrieving they are simply number. Meaning when 97 is stored it is simply stored in some binary form and when retrieved it will also be in the same form. So how does a program knows it is an integer or a character?
* Two strings equality or unequality is measure of their similarities of characters

Question

* The question is simply asking how different two strings are ( even though it is wrapped around so much anagrams and stuff). The question is simply asking how many characters needed to be removed from the respective strings to make them equal.

Solution:

* So  one needs to compare each and every character of one string with another string. And if match is found note that and find out how many strings are similar to one another ( order doesn't matter) . Then deduct that quantity from total number of strings of both

abc = 3

dab = 3

ab = equal between both two = 2

3-2+3-2 = 1+1 = 2 = one string needs to be deducted from each string to make them equal 

abc , c needs to deducted
dab , d needs to be deducted


Pictorial fun:

* Imagine a string is a collection of characters which are simply grenades. When there is equal type of grenade it will blast off. And we need to find out how many blasts are there

![StringsAnagram](https://github.com/codingwithlaaptu/hackerrank/blob/master/pics/StringAnagrams.png)

```
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
```

The below one is finding out the difference between characters of a string. It iterates from a to z and find out the difference of characters between strings. Details is yet to be understood

```
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
```

