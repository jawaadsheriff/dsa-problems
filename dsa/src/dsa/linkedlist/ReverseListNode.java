package dsa.linkedlist;

public class ReverseListNode {
	
	public Node reverseNode(Node head) {
		Node curr = head;
		Node prev = null;
		while(curr!=null) {
			Node nextNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextNode;
		}
		return prev;
	}

	public static void main(String[] args) {
		ReverseListNode obj = new ReverseListNode();
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		Node ans = obj.reverseNode(n1);
		while(ans!=null) {
			System.out.print("("+ans.data+") -> ");
			ans = ans.next;
		}
	}
}
