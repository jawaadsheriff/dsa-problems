package dsa.bitmanipulation;

/*
 * N = 4, K = 2
 */

public class KBitSetOrNot {
	
	public boolean checKthBitSetOrNot(int n, int k) {
		if(((n >> k) & 1) == 1)
			return true;
		return false;
	}

	public static void main(String[] args) {
		KBitSetOrNot obj = new KBitSetOrNot();
		int k = 0, n = 5;
		System.out.println(obj.checKthBitSetOrNot(n, k));
	}
}
