package dsa.twopointers;

public class CheckArrayIsPalindrome {

	public Boolean checkIfArrayIsPalindrome(int[] arr, int n) {
		int j = n - 1;
		int i = 0;
		while(i <= j) {
			if(arr[i] == arr[j]) {
				i++;
				j--;
			}
			else {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 2, 1, 4};
		CheckArrayIsPalindrome obj = new CheckArrayIsPalindrome();
		System.out.println(obj.checkIfArrayIsPalindrome(arr, arr.length));
	}
}
