package dsa.slidingwindow;

import java.util.HashMap;

/*
 * https://leetcode.com/problems/longest-repeating-character-replacement/
 */

public class LongestRepeatingCharacter {

	public int characterReplacement(String s, int k) {
		int ans = 0;
		int left = 0;
		int right = 0;
		HashMap<Character, Integer> mp = new HashMap<>();
		int mxFreq = 0;
		char mxChar = 'A';
		int n = s.length();
		while (right < n) {
			char ch = s.charAt(right);

			if (mp.containsKey(ch) == false) {
				mp.put(ch, 1);
			} else {
				mp.put(ch, mp.get(ch) + 1);
			}
			if (mp.get(ch) > mxFreq) {
				mxFreq = mp.get(ch);
				mxChar = ch;
			}
			int len = right - left + 1;
			while (len - mxFreq > k) {
				char leftChar = s.charAt(left);
				mp.put(leftChar, mp.get(leftChar) - 1);
				if (leftChar == mxChar) {
					mxFreq = mp.get(leftChar);
				}
				left++;
				len = right - left + 1;
				for (char c = 'A'; c <= 'Z'; c++) {
					if (mp.containsKey(c) == true && mp.get(c) > mxFreq) {
						mxFreq = mp.get(c);
						mxChar = c;
					}
				}

			}
			if (len > ans) {
				ans = len;
			}
			right++;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		LongestRepeatingCharacter obj = new LongestRepeatingCharacter();
		String s = "AABABBA";
		int k = 1;
		System.out.println(obj.characterReplacement(s, k));
	}
}
