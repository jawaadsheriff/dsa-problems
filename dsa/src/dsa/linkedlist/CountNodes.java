package dsa.linkedlist;

public class CountNodes {

	public int getCount(Node head) {
		int count = 0;
		if(head == null) {
			return 0;
		}
		while(head!=null) {
			count++;
			head = head.next;
		}
		return count;
	}
	
	public static void main(String[] args) {
		CountNodes obj = new CountNodes();
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		System.out.println(obj.getCount(n1));
	}
}
