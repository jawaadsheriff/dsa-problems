package dsa.recursion;

public class FastExponentiation {

	public int fastPower(int a, int n) {
		if(n == 1) {
			return a;
		}
		int halfPower = fastPower(a, n/2);
		if(n%2 == 0) {
			return halfPower * halfPower;
		}
		else {
			return halfPower * halfPower * a;
		}
	}
	
	public static void main(String[] args) {
		FastExponentiation obj = new FastExponentiation();
		int a = 2;
		int n = 9;
		System.out.println(obj.fastPower(a, n));
	}
}
