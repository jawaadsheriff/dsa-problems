package dsa.recursion;

public class Power {
	
	public int power(int a, int n) {
		if(n == 1) {
			return a;
		}
		return a * power(a, n-1);
	}
	
	public static void main(String[] args) {
		Power obj = new Power();
		int a = 5;
		int n = 4;
		System.out.println(obj.power(a, n));
	}

}
