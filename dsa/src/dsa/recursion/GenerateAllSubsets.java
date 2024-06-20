package dsa.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GenerateAllSubsets {

	static void generateSubset(int i, int arr[], int n, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> curr) {
		if (i == n) {
			ans.add(new ArrayList<Integer>(curr));
			return;
		}
		// take the i-th element
		curr.add(arr[i]);
		generateSubset(i + 1, arr, n, ans, curr); // taking the ith guy
		curr.remove(curr.size() - 1); // backtracking
		// dont take
		generateSubset(i + 1, arr, n, ans, curr);
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
			ArrayList<Integer> curr = new ArrayList<>();
			generateSubset(0, arr, n, ans, curr);
			System.out.println(ans);
		}
	}
}
