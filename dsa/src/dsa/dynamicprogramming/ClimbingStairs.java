package dsa.dynamicprogramming;

import java.util.Scanner;

/*
 * https://leetcode.com/problems/climbing-stairs/description/
 */

public class ClimbingStairs {
	
	public int stairs(int n, int[] dp) {
		if(n == 1) {
			return 1;
		}
		if(n == 2) {
			return 2;
		}
		if(dp[n] != -1) {
			return dp[n];
		}
		int ways = stairs(n-1, dp) + stairs(n-2, dp);
		dp[n] = ways;
		return ways;
	}

	public int climbStairs(int n) {
		int[] dp = new int[n+1];
		for(int i=0; i<=n; i++) {
			dp[i] = -1;
		}
		return stairs(n, dp);
	}
	
	public static void main(String[] args) {
		ClimbingStairs obj = new ClimbingStairs();
		try(Scanner scn = new Scanner(System.in)){
			int n = scn.nextInt();
			System.out.println(obj.climbStairs(n));
		}
	}
}
