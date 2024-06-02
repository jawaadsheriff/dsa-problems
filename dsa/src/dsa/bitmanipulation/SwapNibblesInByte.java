package dsa.bitmanipulation;

/*
 * i/p n = 100 ==> (01100100)
 * o/p n =  70 ==> (01000110)
 * Shift left formula = a * 2^b where a = 2, b = 3 then 2 * 2^3 = 2 * 8 = 16
 * Shift right formula = 2 / 2^b where a = 2, b = 3 then 2 / 2^3 = 2 / 8 = 0
 */

public class SwapNibblesInByte {

	public int swapNibbles(int n) {
		int leftPart = n >> 4;
		int rightPart = n & 15;
		rightPart = rightPart << 4;
		return leftPart | rightPart;
	}
	
	public static void main(String[] args) {
		SwapNibblesInByte obj = new SwapNibblesInByte();
		System.out.println(obj.swapNibbles(129));
	}
}
