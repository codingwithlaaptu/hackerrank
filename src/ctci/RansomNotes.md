[Problem Statement](https://www.hackerrank.com/challenges/ctci-ransom-note)

Concept:

 * Each sentence is a combination of various words
 * To compare if both sentence are equal or not, we simply compare the words between them.
 * So in order to know two words are equal, we can compare each character of words with each other. Another method is to do hashing.
 * What is hashing? Hashing is simply applying some manipulation ( mathematical) to the strings which yields a unique value. Meaning if the hash function is efficient, it will output different hash for different words. So, say hash of "Hello" = a45wyz and "World" = a89uhnx. By this we can know that two strings are equal if their hash values are equal.

 
 About solution:
 * Need to check words of ransom can be found in magazine
 * Need to check occurence of words of ransom with magazinge Meaning, if ransom notes contains two similar words ( `I will kill him and kill her`). Here kill is occuring twice. So magazine also needs to contains a sentence like `Kill bill is a kill movie,where both him and her will be killed by some I`. But if the magazine contains `Kill bill is a movie,where both him and her will be killed by some I`, then there is only one occurence of `kill` and ransom note can't be made

 
 ```
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
 ```