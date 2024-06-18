package dsa.slidingwindow;

/*
 * https://prepfortech.io/leetcode-solutions/max-consecutive-ones-ii
 */

public class MaxConsecutiveOnesWithOneZeroLimit {

	public int maxConsecutiveOnesWithOneZero(int[] nums) {
		int left = 0, right = 0;
		int len = nums.length;
		int maxConsecutiveOnes = 0;
		int zeroes = 0;
		while(right < len) {
			if(nums[right] == 0) {
				zeroes++;
			}
			while(zeroes == 2 && left < right) {
				if(nums[left] == 0) {
					zeroes--;
				}
				left++;
			}
			int tempLen = right - left + 1;
			if(tempLen > maxConsecutiveOnes) {
				maxConsecutiveOnes = tempLen;
			}
			right++;
		}
		return maxConsecutiveOnes;
	}
	
	public static void main(String[] args) {
		MaxConsecutiveOnesWithOneZeroLimit obj = new MaxConsecutiveOnesWithOneZeroLimit();
		int[] nums = {1,0,1,1,0,1,1};
		System.out.println(obj.maxConsecutiveOnesWithOneZero(nums));
	}
}
