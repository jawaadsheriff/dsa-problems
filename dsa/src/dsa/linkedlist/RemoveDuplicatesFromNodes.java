package dsa.linkedlist;

/*
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/submissions/1304515058/
 */

public class RemoveDuplicatesFromNodes {
 
	public  Node deleteDuplicates(Node head) {
		if(head == null) {
			return null;
		}
		Node curr = head;
		while(curr.next!=null) {
			if(curr.data == curr.next.data) {
				curr.next = curr.next.next;
			}
			else {
				curr = curr.next;
			}
		}
		return head;
	}
	
	public static void main(String[] args) {
		RemoveDuplicatesFromNodes obj = new RemoveDuplicatesFromNodes();
		Node n1 = new Node(1);
		Node n2 = new Node(1);
		Node n3 = new Node(3);
		Node n4 = new Node(3);
		Node n5 = new Node(4);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		System.out.println(obj.deleteDuplicates(n1));
	}
}
