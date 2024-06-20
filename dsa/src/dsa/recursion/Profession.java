package dsa.recursion;

import java.util.Scanner;

/*
 * https://www.geeksforgeeks.org/problems/finding-profession3834/1
 */

public class Profession {

	public String getProfession(int level, int position) {
		if(position == 1) {
			return "Engineer";
		}
		String parentProfession = getProfession(level-1, (position+1)/2);
		if(parentProfession.equals("Engineer")) {
			if(position%2 == 1) {
				return "Engineer";
			}
			else {
				return "Doctor";
			}
		}
		else {
			if(position%2 == 1) {
				return "Doctor";
			}
			else {
				return "Engineer";
			}
		}
	}
	
	public static void main(String[] args) {
		Profession obj = new Profession();
		try(Scanner scn = new Scanner(System.in)){
			int level = scn.nextInt();
			int position = scn.nextInt();
			System.out.println(obj.getProfession(level, position));
		}
	}
}
