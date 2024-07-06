package dsa.linkedlist;

import java.util.HashMap;

/*
 * https://www.geeksforgeeks.org/problems/remove-duplicates-from-an-unsorted-linked-list/1
 */

public class RemoveDuplicatesFromUnsortedList {

	public Node removeDuplicates(Node head) {
		if(head == null) {
			return null;
		}
		HashMap<Integer, Boolean> map = new HashMap<>();
		Node curr = head;
		map.put(curr.data, true);
		while(curr.next!=null) {
			if(map.containsKey(curr.next.data)) {
				curr.next = curr.next.next;
			}
			else {
				map.put(curr.next.data, true);
				curr = curr.next;
			}
		}
		return head;
	}
	
	public static void main(String[] args) {
		RemoveDuplicatesFromUnsortedList obj = new RemoveDuplicatesFromUnsortedList();
		Node n1 = new Node(4);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(2);
		Node n5 = new Node(4);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		System.out.println(obj.removeDuplicates(n1));
	}
}
