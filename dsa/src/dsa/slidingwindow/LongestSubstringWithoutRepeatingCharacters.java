package dsa.slidingwindow;

import java.util.HashMap;

/*
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/description/ 
 */

public class LongestSubstringWithoutRepeatingCharacters {

	public int lengthOfLongestSubstring(String s) {
		int left = 0, right = 0;
		int n = s.length();
		int maxLength = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		while(right < n) {
			if(!map.containsKey(s.charAt(right))) {
				map.put(s.charAt(right), 1);
			}
			else if(map.containsKey(s.charAt(right))) {
				map.put(s.charAt(right), map.get(s.charAt(right)) + 1);
			}
			while(left<=right && map.get(s.charAt(right)) == 2) {
				map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
				left++;
			}
			int len = right - left +1;
			if(len > maxLength) {
				maxLength = len;
			}
			right++;
		}
		return maxLength;
	}
	
	public static void main(String[] args) {
		LongestSubstringWithoutRepeatingCharacters obj = new LongestSubstringWithoutRepeatingCharacters();
		String s = "pwwkew";
		System.out.println(obj.lengthOfLongestSubstring(s));
	}
}
