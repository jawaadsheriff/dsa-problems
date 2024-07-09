package dsa.binarysearchtree;

/*
 * https://leetcode.com/problems/same-tree/description/
 */

public class SameTree {
	
	public boolean recursive(TreeNode p, TreeNode q) {
		if(p == null && q == null) {
			return true;
		}
		if(p != null && q == null) {
			return false;
		}
		if(p==null && q!=null) {
			return false;
		}
		if(p!=null && q!=null && p.val != q.val) {
			return false;
		}
		boolean leftStatus = recursive(p.left, q.left);
		boolean rightStatus = recursive(p.right, q.right);
		if(leftStatus == true && rightStatus == true) {
			return true;
		}
		return false;
	}

	public boolean isSameTree(TreeNode p, TreeNode q) {
		return recursive(p, q);
	}
	
	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode m1 = new TreeNode(1);
		TreeNode m2 = new TreeNode(2);
		TreeNode m3 = new TreeNode(3);
		n1.left = n2;
		n1.right = n3;
		n2.left = null;
		n2.right = null;
		n3.left = null;
		n3.right = null;
		m1.left = m2;
		m1.right = m3;
		m2.left = null;
		m2.right = null;
		m3.left = null;
		m3.right = null;
		SameTree obj = new SameTree();
		System.out.println(obj.isSameTree(n1, m1));
	}
}
