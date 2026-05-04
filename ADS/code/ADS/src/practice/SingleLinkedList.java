package practice;

class Node{
	int data;
	Node next;
	
	public Node(int d) {
		this.data = d;
		this.next = null;
	}
}

class LinkedList {
	Node head;
	
	public void insertFirst(int d) {
		Node newnode = new Node(d);
		if(head ==  null) {
			head = newnode;
			return;
		}
		newnode.next = head;
		head = newnode;
		return;
	}
	
	public void insertLast(int d) {
		Node newnode = new Node(d); 
		if(head == null) {
			head = newnode;
			return;
		}
		Node iter = head;
		while(iter.next != null) {
			iter = iter.next;
		}
		iter.next = newnode;
	}
	
	public void display() { 
		if(head == null) {
			System.out.println("LinkList is Empty...");
			return;
		}
		Node iter = head;
		while(iter != null) {
			System.out.print(iter.data +" --> ");
			iter = iter.next;
		}
//		System.out.println("null");
	}
	public void deleteFirst() {
		if(head == null) {
			System.out.println("LinkList is Empty...");
			return;
		}
		head = head.next;
	}
	
	public void deleteLast() {
		if(head == null) {
			System.out.println("LinkList is Empty...");
			return;
		}
		if(head.next == null) {
			head = null;
			return;
		}
		Node iter = head;
		while(iter.next.next != null) {
			iter = iter.next;
		}
		iter.next = null;
	}
	
//	public void insertAtPosition(int d, int index) {
//		Node newnode = new Node(d);
//		if(index > size || index < 0) {
//			System.out.println("Invalid Index value");
//		}
//		if(head == null) {
//			head = newnode;
//			return;
//		}
//		
//	}

	public void reverse() {
	    Node prev = null;
	    Node curr = head;
	    Node next = null;

	    while (curr != null) {
	        next = curr.next;   // 1. store next
	        curr.next = prev;   // 2. reverse link
	        prev = curr;        // 3. move prev
	        curr = next;        // 4. move curr
	    }

	    head = prev; // new head
	}
	
}
public class SingleLinkedList{
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		ll.insertFirst(5);
		ll.insertFirst(10);
		ll.insertFirst(15);
		
		ll.display();
		System.out.println();
		ll.insertLast(20);
		
//		ll.display();
//		System.out.println();	
//		ll.deleteFirst();
//		ll.display();
//		System.out.println();
//		
//		ll.deleteLast();
//		ll.display();
		
		ll.reverse();
		ll.display();
		
	}
}