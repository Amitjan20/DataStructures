package org.amit.programs.codinginterview;

public class CheckPermutations {
		public static String sort(String s) {
			char[] content = s.toCharArray();
			java.util.Arrays.sort(content);
			return new String(content);
		}
		
		public static boolean permutation(String s, String t) {
			return sort(s).equals(sort(t));
		}
		
		public static String sort1(String word){
			
			char arr[] = word.toCharArray();
			java.util.Arrays.sort(arr);
			return new String(arr)  ;
		}
		public static boolean anagram(String word1, String word2){
			return sort1(word1).equals(sort1(word2));
		}
		
		public static void main(String[] args) {
			String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
			for (String[] pair : pairs) {
				String word1 = pair[0];
				String word2 = pair[1];
				boolean anagram = permutation(word1, word2);
				System.out.println(word1 + ", " + word2 + ": " + anagram);
			}
		}
}
