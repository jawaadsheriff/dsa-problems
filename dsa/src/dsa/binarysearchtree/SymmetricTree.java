package dsa.binarysearchtree;

/*
 * https://leetcode.com/problems/symmetric-tree/
 */

public class SymmetricTree {
	
	public boolean recursive(TreeNode p, TreeNode q) {
		if(p==null && q==null) {
			return true;
		}
		if(p!=null && q==null) {
			return false;
		}
		if(p==null && q!=null) {
			return false;
		}
		if(p.val!=q.val) {
			return false;
		}
		boolean leftCheck = recursive(p.left, q.right);
		boolean rightCheck = recursive(p.right, q.left);
		if(leftCheck ==  true && rightCheck == true) {
			return true;
		}
		return false;
	}

	public boolean isSymmetric(TreeNode root) {
		return recursive(root.left, root.right);
	}
	
	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(2);
		TreeNode n4 = new TreeNode(3);
		TreeNode n5 = new TreeNode(3);
		TreeNode n6 = new TreeNode(4);
		TreeNode n7 = new TreeNode(4);
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n6;
		n3.left = n7;
		n3.right = n5;
		SymmetricTree obj = new SymmetricTree();
		System.out.println(obj.isSymmetric(n1));
	}
}
