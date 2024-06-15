package dsa.twopointers;

import java.util.Arrays;

/*
 * https://www.geeksforgeeks.org/problems/key-pair5616/1
 */

public class ArrayKeyPair {

	public boolean hasArrayTwoCandidates(int arr[], int n, int x) {
		int i = 0;
		int j = n - 1;
		int sum = 0;
		Arrays.sort(arr);
		while(i < j) {
			sum = arr[i] + arr[j];
			if(sum == x) {
				return true;
			}
			else if(sum > x) {
				j--;
			}
			else if(sum < x) {
				i++;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		ArrayKeyPair obj = new ArrayKeyPair();
		int[] arr = {1, 2, 4, 3, 6};
		int n = arr.length;
		int x = 10;
		System.out.println(obj.hasArrayTwoCandidates(arr, n, x));
	}
}
