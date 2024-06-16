package dsa.slidingwindow;

/*
 * https://leetcode.com/problems/max-consecutive-ones/description/
 */

public class MaxConsecutive1s {

	public int findMaxConsecutiveOnes(int[] nums) {
		int max = 0, count = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 1) {
				count++;
				if(count > max) {
					max = count;
				}
			}
			else {
				count = 0;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		MaxConsecutive1s obj = new MaxConsecutive1s();
		int[] nums = {1,1,0,1,1,1};
		System.out.println(obj.findMaxConsecutiveOnes(nums));
	}
}
