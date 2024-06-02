package dsa.bitmanipulation;

public class FindMissingNumberInArray {

	public int findMissingNumber(int array[], int size) {
		int x1 = array[0];
		int x2 = 1;
		for(int i = 1; i < size; i++) {
			x1 = x1 ^ array[i];
		}
		for(int i = 2; i <= size + 1; i++) {
			x2 = x2 ^ i;
		}
		return (x1 ^ x2);
	}
	
	public static void main(String[] args) {
		FindMissingNumberInArray obj = new FindMissingNumberInArray();
		int array[] = {3, 1, 4, 2, 5, 8, 6, 9, 10};
		int size = array.length;
		System.out.println(obj.findMissingNumber(array, size));
	}
}
