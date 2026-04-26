package LinkedList;

class IntNode1 {
	private int data;
	private IntNode1 next;
	
	public IntNode1() {
		data = 0;
		next = null;
	}
	public IntNode1(int d) {
		data = 0;
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


class LinkedList1{
	private IntNode1 head;
	
	public LinkedList1() {
		head = null;
	}
	
	public void InsertFirst () {
		IntNode1 new_node = new IntNode1(d);
		if(head == null)
		{
			head = new_node;
			return;
		}
		new_node.setNext(head);
		head = new_node;
		return;
	}
	public void insertLast(int d) {
		IntNode1 new_node = new IntNode1();
		if(head == null) {
			head = new_node;
			return;
		}
		IntNode1 iter = head;
		while(iter.getNext() != null)
			iter = iter.getNext(); 
		
		iter.setNext(new_node);
		return;
	}
	public void display() {
		IntNode1 iter = head;
		while(iter != null)
		{
			System.out.println(iter.getData()+"-->");
			iter = iter.getNext();
		}
	}
	public int deleteFirst() {
		if(head == null)
			return -999;
		
		int d = head.getData();
		head = head.getNext();
		return d;
	}
}

public class IntNode{
	public static void main(String[] args) {
		
	}
}


