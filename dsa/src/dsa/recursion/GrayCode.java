package dsa.recursion;

/*
 * https://www.geeksforgeeks.org/problems/gray-code-1611215248/1
 */

import java.util.ArrayList;
import java.util.Scanner;

public class GrayCode {
	
	public ArrayList<String> grayCode(int n){
		ArrayList<String> ans = new ArrayList<>();
		if(n == 1) {
			ans.add("0");
			ans.add("1");
			return ans;
		}
		ArrayList<String> prev = grayCode(n-1);
		//first half is same as previous
		for(int i = 0; i < prev.size(); i++) {
			ans.add("0"+prev.get(i));
		}
		//second half is same as previous in reverse order
		for(int i = prev.size()-1; i >= 0; i--) {
			ans.add("1"+prev.get(i));
		}
		return ans;
	}
	
	public static void main(String[] args) {
		GrayCode obj = new GrayCode();
		try (Scanner scn = new Scanner(System.in)) {
			int n = scn.nextInt();
			System.out.println(obj.grayCode(n));
		}
	}

}
