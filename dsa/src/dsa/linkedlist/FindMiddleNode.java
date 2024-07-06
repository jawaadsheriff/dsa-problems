package dsa.linkedlist;

/*
 * https://leetcode.com/problems/middle-of-the-linked-list/submissions/1304466695/
 */

public class FindMiddleNode {

	public Node middleNode(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	public static void main(String[] args) {
		FindMiddleNode obj = new FindMiddleNode();
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		Node ans = obj.middleNode(n1);
		System.out.println(ans.data);
	}
}
