package dsa.dynamicprogramming;

import java.util.Scanner;

/*
 * https://leetcode.com/problems/unique-paths/description/
 */

public class UniquePaths {
	
	public int uniquePaths(int n, int m) {
		int[][] dp = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				dp[i][j] = -1;
			}
		}
		return recursive(0, 0, n, m, dp);
	}
	
	public int recursive(int i, int j, int n, int m, int[][] dp) {
		if(i==n || j==m) {
			return 0;
		}
		if(i==n-1 && j==m-1) {
			return 1;
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		int down = recursive(i+1, j, n, m, dp);
		int right = recursive(i, j+1, n, m, dp);
		int ways = down + right;
		dp[i][j] = ways;
		return ways;
	}

	public static void main(String[] args) {
		UniquePaths obj = new UniquePaths();
		try(Scanner scn = new Scanner(System.in)){
			int m = scn.nextInt();
			int n = scn.nextInt();
			System.out.println(obj.uniquePaths(m, n));
		}
	}
}
