package dsa.arrays;

import java.util.Scanner;

public class SieveOfEratosthenesPrime {

	public void printAllPrimes(int n) {
		boolean[] elements = new boolean[n+1];
		elements[1] = false;
		for(int i = 2; i < elements.length; i++) {
			elements[i] = true;
		}
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(elements[i] == true) {
				for(int j = i * i; j <= n; j = j+i) {
					elements[j] = false;
				}
			}
		}
		for(int i = 1; i < elements.length; i++) {
			System.out.println(i+" "+elements[i]);
		}
	}
	
	public static void main(String[] args) {
		SieveOfEratosthenesPrime obj = new SieveOfEratosthenesPrime();
		try(Scanner scn = new Scanner(System.in)){
			System.out.print("Enter number: ");
			int n = scn.nextInt();
			obj.printAllPrimes(n);
		}
	}
}
