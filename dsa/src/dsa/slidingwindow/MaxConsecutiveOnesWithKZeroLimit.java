package dsa.slidingwindow;

/*
 * https://leetcode.com/problems/max-consecutive-ones-iii/description/
 */

public class MaxConsecutiveOnesWithKZeroLimit {

	public int maxConsecutiveOnes(int[] nums, int k) {
		int right = 0, left = 0;
		int maxLen = 0;
		int len = nums.length;
		int zeroes = 0;
		while(right < len) {
			if(nums[right] == 0) {
				zeroes++;
			}
			while(zeroes > k && left <= right) {
				if(nums[left] == 0) {
					zeroes--;
				}
				left++;
			}
			int tempLen = right - left + 1;
			if(maxLen < tempLen) {
				maxLen = tempLen;
			}
			right++;
		}
		return maxLen;
	}
	
	public static void main(String[] args) {
		MaxConsecutiveOnesWithKZeroLimit obj = new MaxConsecutiveOnesWithKZeroLimit();
		int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
		int k = 3;
		System.out.println(obj.maxConsecutiveOnes(nums, k));
	}
}
