package LinkedList.singly;

import java.util.Scanner;

class IntNode1 {
	private int data;
	private IntNode1 next;

	public IntNode1() {
		data = 0;
		next = null;
	}

	public IntNode1(int d) {
		data = d;
		next = null;
	}

	public void setData(int d) {
		data = d;
	}

	public int getData() {
		return data;
	}

	public void setNext(IntNode1 n) {
		next = n;
	}

	public IntNode1 getNext() {
		return next;
	}
}

class LinkedList1 {
	private IntNode1 head;

	
	public LinkedList1() {
		head = null;
	}

	public void InsertFirst(int d) {
		IntNode1 new_node = new IntNode1(d);
		if(head == null) {
			head = new_node;
			return;
		}
		new_node.setNext(head);
		head = new_node;
		return; 
	}

	public void InsertLast(int d) {
		IntNode1 new_node = new IntNode1(d);
		if(head == null) {
			head = new_node;
			return;
		}
		IntNode1 iter = head;
		while(iter != null) {
			iter = iter.getNext();
			iter.setNext(new_node);
			return;
		}
	}

	public void display() {
		IntNode1 iter = head;
		while (iter != null) {
			System.out.print
			(iter.getData() + "-->");
			iter = iter.getNext();
		}
	}

	public int deleteFirst() {
		if (head == null)
			return -999;

		int d = head.getData();
		head = head.getNext();
		return d;
	}

	public void InsertSorted(int d) {
		IntNode1 new_node = new IntNode1(d);
		if (head == null || d < head.getData()) {
			InsertFirst(d);
			return;
		}

		IntNode1 iter = head;
		while (iter.getNext() != null && iter.getNext().getData() < d)
			iter =
			iter.getNext();

		new_node.setNext(iter.getNext());
		iter.setNext(new_node);
		return;
	}

	public void InsertBefore(int d, int key) {
		IntNode1 new_node = new IntNode1(d);
		if (head == null) {
			System.out.println("List is Empty");
			return;
		}
		if (head.getData() == key) {
			InsertFirst(d);
			return;
		}

		IntNode1 iter = head;
		while (iter.getNext() != null && iter.getNext().getData() != key)
			iter = iter.getNext();
		if (iter.getNext() != null) {
			new_node.setNext(iter.getNext());
			iter.setNext(new_node);

			return;
		} else {
			System.out.println("Invalid key");
			return;
		}
	}
}

public class IntNode {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		LinkedList1 ll = new LinkedList1();
		char ch;
		int num;

		do {
			System.out.println("\nLinkedList Operations");
			System.out.println("1. Insert First");
			System.out.println("2. Insert Last");
			System.out.println("3. Display");
			System.out.println("4. Delete First");
			System.out.println("5. InsertSorted");
			System.out.println("6. InsertBefore");

			System.out.println("7. Exit");
			ch = s.next().charAt(0);

			switch (ch) {
			case '1':
				System.out.println("Enter First: ");
				int no1 = s.nextInt();
				ll.InsertFirst(no1);
				break;
			case '2':
				System.out.println("Enter Last: ");
				int no2 = s.nextInt();
				ll.InsertLast(no2);
				break;
			case '3':
				ll.display();
				break;
			case '4':
				num = ll.deleteFirst();
				if (num == -999)
					System.out.println("List is empty");
				else
					System.out.println("Deleted Element: " + num);
				break;
			case '5':
				System.out.println("Enter Number: ");
				int no3 = s.nextInt();
				ll.InsertSorted(no3);
				break;
			case '6':
				System.out.println("Enter value to insert: ");
				int d = s.nextInt();
				System.out.println("Enter key before which to insert: ");
				int key = s.nextInt();
				ll.InsertBefore(d, key);
				break;
			case '7':
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Enter valid choise");
			}
		} while (ch != '7');
	}
}
