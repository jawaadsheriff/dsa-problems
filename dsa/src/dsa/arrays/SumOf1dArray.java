package dsa.arrays;

import java.util.Scanner;

public class SumOf1dArray {

	public int[] runningSum(int[] num) {
		int[] prefix = new int[num.length];
		prefix[0] = num[0];
		for(int i = 1; i < num.length; i++) {
			prefix[i] = prefix[i-1] + num[i];
		}
		return prefix;
	}
	
	public static void main(String[] args) {
		SumOf1dArray obj = new SumOf1dArray();
		try(Scanner scn = new Scanner(System.in)){
			System.out.println("Enter the size of array: ");
			int size = scn.nextInt();
			int[] num = new int[size];
			System.out.println("Enter the array elements: ");
			for(int i = 0; i < size; i++) {
				num[i] = scn.nextInt();
			}
			for(int sum: obj.runningSum(num)) {
				System.out.print(sum+" ");
			}
		}
	}
}
