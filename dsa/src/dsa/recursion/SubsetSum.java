package dsa.recursion;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * https://www.geeksforgeeks.org/problems/subset-sums2234/1
 */

public class SubsetSum {
	
	public ArrayList<Integer> subsetSum(ArrayList<Integer> arr, int n){
		ArrayList<Integer> ans = new ArrayList<>();
		recursive(0, arr, 0, n, ans);
		return ans;
	}
	
	public void recursive(int index, ArrayList<Integer> arr, int sum, int n, ArrayList<Integer> ans) {
		if(index == n) {
			ans.add(sum);
			return;
		}
		// Take ith element
		recursive(index+1, arr, sum+arr.get(index), n, ans);
		// Dont take ith element
		recursive(index+1, arr, sum, n, ans);
	}

	public static void main(String[] args) {
		SubsetSum obj = new SubsetSum();
		try(Scanner scn = new Scanner(System.in)){
			ArrayList<Integer> arr = new ArrayList<>();
			int n = scn.nextInt();
			for(int i=0; i<n; i++) {
				arr.add(scn.nextInt());
			}
			System.out.println(obj.subsetSum(arr, n));
		}
	}
}
