package LinkedList.doubly;

import java.util.Scanner;

class DNode {
	int data;
	DNode prev;
	DNode next;

	public DNode() {
		data = 0;
		prev = next = null;
	}

	public DNode(int data) {
		this.data = data;
		prev = next = null;
	}
}

class DoublyLL {
	private DNode head;

	public DoublyLL() {
		head = null;
	}

	public void insertFirst(int data) {
		DNode new_node = new DNode(data);
		if (head == null) {
			head = new_node;
			return;
		}
		new_node.next = head;
		head.prev = new_node;
		head = new_node;
	}
	
	public void insertLast(int data) {
		DNode new_node = new DNode(data);
		if(head == null) {
			head = new_node;
			return;
		}
		DNode temp = head;
			while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = new_node;
		new_node.prev = temp;
		return;
	}
	public void insertByPos(int data,int pos) {
		DNode new_node = new DNode(data);
		if(head == null) {
			head = new_node;
			return;
		}
		if (pos == 1) {
			insertFirst(data);
			return;
		}
		DNode temp = head;
		for(int i=1;i<pos-1;i++) {
			temp = temp.next;
		}
		new_node.next = temp.next;
		new_node.prev = temp;
		temp.next = new_node;
		new_node.next.prev = new_node;
		return;
	}
	
	
	public void display() {
		DNode temp = head;
		while(temp != null) {
			System.out.print(temp.data+"<-->");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
}

public class DubblyNode {
	public static void main(String[] args) {
		DoublyLL dl = new DoublyLL();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a size of list");
		int size = s.nextInt();
		
		for(int i=1;i<=size;i++) {
			System.out.println("Insert your Element :");
			int no1 = s.nextInt();
			dl.insertFirst(no1);
		}
		
		System.out.println("Doubly LinkedList :");
		dl.display();
		
		System.out.println("Insert Last Element :");
		int no2 = s.nextInt();
		dl.insertLast(no2);
		
		System.out.println("Doubly LinkedList :");
		dl.display();
		
//		System.out.println("Insert By Position");
		
		System.out.println("Insert the data :");
		int data = s.nextInt();
		
		System.out.println("Insert the data :");
		int pos = s.nextInt();
		dl.insertByPos(data,pos);
		
		System.out.println("Doubly LinkedList :");
		
		dl.display();
	}
	
}
