package dsa.arrays;

import java.util.Scanner;

public class CheckIfNumberIsPrime {

	public boolean checkPrime(int n) {
		int count = 0;
		if(n <= 0) {
			System.err.print("Enter positive integer!");
			System.exit(0);
		}
		if(n == 1)
			return false;
		for(int i = 2; i <= n/2; i++) {
			if(n % i == 0) {
				count++;
			}
		}
		if(count == 0)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		CheckIfNumberIsPrime obj = new CheckIfNumberIsPrime();
		try (Scanner scn = new Scanner(System.in)) {
			System.out.print("Enter number: ");
			int n = scn.nextInt();
			System.out.println(n+" "+obj.checkPrime(n));
		}
	}
}
