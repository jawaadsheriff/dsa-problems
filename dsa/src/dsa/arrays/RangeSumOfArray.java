package dsa.arrays;

import java.util.Scanner;

public class RangeSumOfArray {

	private int[] prefix;
	
	public RangeSumOfArray(int[] nums) {
		prefix = new int[nums.length];
		prefix[0] = nums[0];
		for(int i = 1; i < nums.length; i++) {
			prefix[i] = nums[i] + prefix[i-1];
		}
	}
	
	public void printPrefixSum() {
		for(int sum: prefix) {
			System.out.print(sum+" ");
		}
	}
	
	public int sumRange(int left, int right) {
		if(left == 0)
			return prefix[right];
		else
			return prefix[right] - prefix[left-1];
	}
	
	public static void main(String[] args) {
		try(Scanner scn = new Scanner(System.in)){
			System.out.println("Enter the size of array: ");
			int size = scn.nextInt();
			int[] num = new int[size];
			System.out.println("Enter the array elements: ");
			for(int i = 0; i < size; i++) {
				num[i] = scn.nextInt();
			}
			RangeSumOfArray obj = new RangeSumOfArray(num);
			System.out.println("Enter the range: ");
			int left = scn.nextInt();
			int right = scn.nextInt();
			obj.printPrefixSum();
			System.out.println(obj.sumRange(left, right));
		}
	}
}
