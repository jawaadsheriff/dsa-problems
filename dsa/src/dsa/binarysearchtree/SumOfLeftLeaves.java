package dsa.binarysearchtree;

/*
 * https://leetcode.com/problems/sum-of-left-leaves/description/
 */

public class SumOfLeftLeaves {

	public static int total = 0;
	
	public int sumOfLeftLeaves(TreeNode root) {
		total = 0;
		recursive(root, 'c');
		return total;
	}
	
	public void recursive(TreeNode node, char direction) {
		if(node == null) {
			return;
		}
		if(node.left == null && node.right == null && direction == 'l' ) {
			total += node.val;
			return;
		}
		recursive(node.left, 'l');
		recursive(node.right, 'r');
	}
	
	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(3);
		TreeNode n2 = new TreeNode(9);
		TreeNode n3 = new TreeNode(20);
		TreeNode n4 = new TreeNode(15);
		TreeNode n5 = new TreeNode(7);
		n1.left = n2;
		n1.right = n3;
		n2.left = null;
		n2.right = null;
		n3.left = n4;
		n3.right = n5;
		n4.left = null;
		n4.right = null;
		n5.left = null;
		n5.right = null;
		SumOfLeftLeaves obj = new SumOfLeftLeaves();
		System.out.println(obj.sumOfLeftLeaves(n1));
	}
}
