package dsa.linkedlist;

public class SinglyLinkedListGeneration {

	public static void main(String[] args) {
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		n1.next = n2;
		n2.next = n3;
		Node curr = n1;
		while(curr!=null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}
}
