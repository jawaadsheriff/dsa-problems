package dsa.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * https://leetcode.com/problems/gray-code/description/
 */

public class GrayCodeInDigits {
	
	public List<Integer> grayCodeInDigits(int n){
		ArrayList<Integer> ans = new ArrayList<>();
		if(n == 1) {
			ans.add(0);
			ans.add(1);
			return ans;
		}
		List<Integer> prev = grayCodeInDigits(n-1);
		for(int i = 0; i < prev.size(); i++) {
			ans.add(prev.get(i));
		}
		for(int i = prev.size()-1; i >= 0; i--) {
			ans.add(prev.get(i) + (1<<(n-1)));
		}
		return ans;
	}
	
	public static void main(String[] args) {
		GrayCodeInDigits obj = new GrayCodeInDigits();
		try(Scanner scn = new Scanner(System.in)){
			int n = scn.nextInt();
			System.out.println(obj.grayCodeInDigits(n));
		}
	}
}
