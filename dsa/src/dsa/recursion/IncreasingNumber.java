package dsa.recursion;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * https://www.geeksforgeeks.org/problems/n-digit-numbers-with-digits-in-increasing-order5903/1
 */

public class IncreasingNumber {

	public ArrayList<Integer> increasingNumber(int n){
		ArrayList<Integer> ans = new ArrayList<>();
		if(n == 1) {
			for(int i=0; i<=9; i++) {
				ans.add(i);
			}
			return ans;
		}
		allPossibleWays(n, ans, 0, 0);
		return ans;
	}
	
	public void allPossibleWays(int n, ArrayList<Integer> ans, int prev, int num) {
		if(n == 0) {
			ans.add(num);
			return;
		}
		for(int digit=prev+1; digit<=9; digit++) {
			allPossibleWays(n-1, ans, digit, num*10+digit);
		}
	}
	
	public static void main(String[] args) {
		IncreasingNumber obj = new IncreasingNumber();
		try(Scanner scn = new Scanner(System.in)){
			int n = scn.nextInt();
			System.out.println(obj.increasingNumber(n));
		}
	}
}
