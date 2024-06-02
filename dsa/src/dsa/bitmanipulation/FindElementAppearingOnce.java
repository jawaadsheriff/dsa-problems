package dsa.bitmanipulation;

/*
 * A = {1, 2, 2, 5, 5} N = 5
 */


public class FindElementAppearingOnce {

	public int search(int array[], int size) {
		int value = 0;
		for(int i = 0; i < size; i++) {
			value = value ^ array[i];
		}
		return value;
	}
	
	public static void main(String args[]) {
		FindElementAppearingOnce obj = new FindElementAppearingOnce();
		int array[] = {25, 45, 8, 6, 45, 25, 6};
		int size = 7;
		System.out.println(obj.search(array, size));
	}
}
