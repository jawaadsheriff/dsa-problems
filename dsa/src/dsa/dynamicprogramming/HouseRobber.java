package dsa.dynamicprogramming;

import java.util.Scanner;

/*
 * https://leetcode.com/problems/house-robber/description/
 */

public class HouseRobber {

	public int rob (int[] nums) {
		int n = nums.length;
		int[] dp = new int[n];
		for(int i=0; i<n; i++) {
			dp[i] = -1;
		}
		return recursive(nums, 0, dp);
	}
	
	public int recursive(int[] nums, int i, int[] dp) {
		if(i >= nums.length) {
			return 0;
		}
		if(dp[i] != -1) {
			return dp[i];
		}
		int take = nums[i] + recursive(nums, i+2, dp);
		int skip = recursive(nums, i+1, dp);
		int max = Math.max(take, skip);
		dp[i] = max;
		return max;
	}
	
	public static void main(String[] args) {
		HouseRobber obj = new HouseRobber();
		try(Scanner scn = new Scanner(System.in)){
			int n = scn.nextInt();
			int[] nums = new int[n];
			for(int i=0; i<n; i++) {
				nums[i] = scn.nextInt();
			}
			System.out.println(obj.rob(nums));
		}
	}
}
