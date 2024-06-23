package dsa.dynamicprogramming;

import java.util.Scanner;

public class FibonacciUsingDP {

	public int fibonacci(int n, int[] dp) {
		if(n == 1) {
			return 0;
		}
		if(n == 2) {
			return 1;
		}
		if(dp[n] != -1) {
			return dp[n];
		}
		int ans = fibonacci(n-1, dp) + fibonacci(n-2, dp);
		dp[n] = ans;
		return ans;
	}
	
	public static void main(String[] args) {
		FibonacciUsingDP obj = new FibonacciUsingDP();
		try(Scanner scn = new Scanner(System.in)){
				int n = scn.nextInt();
				int[] dp = new int[n+1];
				for(int i=0; i<=n; i++) {
					dp[i] = -1;
				}
				System.out.println(obj.fibonacci(n, dp));
		}
	}
}
