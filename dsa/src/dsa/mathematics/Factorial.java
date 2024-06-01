package dsa.mathematics;

public class Factorial {

	public Integer getFactorial(int x) {
		if(x == 1)
			return 1;
		return getFactorial(x-1) * x; 
	}
	public static void main(String argsp[]) {
		Factorial obj = new Factorial();
		System.out.println(obj.getFactorial(4));
	}
}
