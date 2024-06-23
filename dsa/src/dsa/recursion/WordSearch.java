package dsa.recursion;

import java.util.Scanner;

public class WordSearch {

	public boolean exists(char[][] board, String word) {
		int rows = board.length;
		int cols = board[0].length;
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				if(board[i][j] == word.charAt(0)) {
					boolean temp = recursive(i, j, board, rows, cols, word, 0);
					if(temp == true) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public boolean recursive(int i, int j, char[][] board, int rows, int cols, String word, int index) {
		if(index == word.length()) {
			return true;
		}
		if(i<0 || j<0 || i==rows || j==cols || board[i][j]!=word.charAt(index)) {
			return false;
		}
		char ch = board[i][j];
		board[i][j] = '#';
		boolean up = recursive(i-1, j, board, rows, cols, word, index+1);
		boolean down = recursive(i+1, j, board, rows, cols, word, index+1);
		boolean left = recursive(i, j-1, board, rows, cols, word, index+1);
		boolean right = recursive(i, j+1, board, rows, cols, word, index+1);
		board[i][j] = ch;
		if(up==true || down==true || left==true || right==true) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		WordSearch obj = new WordSearch();
		try(Scanner scn = new Scanner(System.in)){
			int rows = scn.nextInt();
			int cols = scn.nextInt();
			char[][] board = new char[rows][cols];
			for(int i=0; i<rows; i++) {
				for(int j=0; j<cols; j++) {
					board[i][j] = scn.next().charAt(0);
				}
			}
			String word = scn.next();
			System.out.println(obj.exists(board, word));
		}
	}
}
