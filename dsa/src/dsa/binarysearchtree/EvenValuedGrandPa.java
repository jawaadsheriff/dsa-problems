package dsa.binarysearchtree;

/*
 * https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent/description/
 */

public class EvenValuedGrandPa {
	
	public int total = 0;

	public int sumEvenGrandparent(TreeNode root) {
		recursive(root, null, null);
		return total;
	}
	
	public void recursive(TreeNode curr, TreeNode currFather, TreeNode grandPa) {
		if(curr == null) {
			return;
		}
		if(grandPa!=null && grandPa.val%2==0) {
			total+=curr.val;
		}
		recursive(curr.left, curr, currFather);
		recursive(curr.right, curr, currFather);
	}
	
	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(6);
		TreeNode n2 = new TreeNode(7);
		TreeNode n3 = new TreeNode(8);
		TreeNode n4 = new TreeNode(2);
		TreeNode n5 = new TreeNode(7);
		TreeNode n6 = new TreeNode(1);
		TreeNode n7 = new TreeNode(3);
		TreeNode n8 = new TreeNode(9);
		TreeNode n9 = new TreeNode(1);
		TreeNode n10 = new TreeNode(4);
		TreeNode n11 = new TreeNode(5);
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
		n3.right = n7;
		n4.left = n8;
		n5.left = n9;
		n5.right = n10;
		n7.right = n11;
		EvenValuedGrandPa obj = new EvenValuedGrandPa();
		System.out.println(obj.sumEvenGrandparent(n1));
	}
}
