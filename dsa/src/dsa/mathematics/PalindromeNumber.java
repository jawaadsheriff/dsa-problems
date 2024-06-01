package dsa.mathematics;

public class PalindromeNumber {

	public boolean isPalindrome(int x) {
		int result = 0;
		int input = x;
		while(input > 0) {
			int digit = input % 10;
			result = result * 10 + digit;
			input = input / 10;
		}
		return (result == x);
	}
	
	public static void main(String args[]) {
		PalindromeNumber obj = new PalindromeNumber();
		System.out.println(obj.isPalindrome(121011));
	}
}