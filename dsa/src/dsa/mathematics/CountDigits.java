package dsa.mathematics;

public class CountDigits {

	public Integer getDigitsCount(int x) {
		int i = 0;
		while(x > 0) {
			x = x/10;
			i++;
		}
		return i;
	}
	
	public static void main(String args[]) {
		CountDigits obj = new CountDigits();
		System.out.println(obj.getDigitsCount(673676));
	}
}