package dsa.bitmanipulation;

/*
 * Brian Kernighan's Algorithm
 * i/p n = 6 
 * o/p result = 2
 */

public class CountNumberOfSetBits {

	public int countNumberOfBits(int n) {
		int count = 0;
		while(n > 0) {
			n = n & (n-1);
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		CountNumberOfSetBits obj = new CountNumberOfSetBits();
		System.out.println(obj.countNumberOfBits(16));
	}
}
