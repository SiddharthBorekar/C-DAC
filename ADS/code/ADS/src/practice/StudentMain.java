package practice;
class Student1{
	private int age;
	private String name;
	private int marks;
	
	
	public Student1() {
		this.age = 0;
		this.name = "NA";
		this.marks = 0;
	}
	public Student1(int age, String name, int marks) {
		this.age = age;
		this.name = name;
		this.marks = marks;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student1 [age=" + age + ", name=" + name + ", marks=" + marks + "]";
	}


}
class node2{
	private Student1 data;
	private node2 next;
	
	public node2(Student1 d){
		this.data = d;
		this.next = null;
	}
	public Student1 getData() {
		return data;
	}
	public void setData(Student1 data) {
		this.data = data;
	}
	public node2 getNext() {
		return next;
	}
	public void setNext(node2 next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return "node2 [data=" + data + ", next=" + next + "]";
	}
}


class Studll{
	private node2 head;
	
	public Studll() {
		this.head = null;
	}
	
	public Studll(node2 head) {
		this.head = head;
	}

	public node2 getHead() {
		return head;
	}

	public void setHead(node2 head) {
		this.head = head;
	}
	
	public void insertFirst(Student1 d) {
		node2 newnode = new node2(d);
		if(head == null) {
			head = newnode;
			return;
		}
		newnode.setNext(head);
		head = newnode;
		return;
	}
	
	public void insertlast(Student1 d) {
		node2 newnode = new node2(d);
		if (head == null){
			head = newnode;
			return;
		}
		node2 iter = head;
		while(iter.getNext() != null) {
			iter = iter.getNext();
		}
		iter.setNext(newnode);
	}
	
	public void deleteFirst() {
		if (head == null){
			System.out.println("LinkedList is Empty:");
			return;
		}
		head = head.getNext();
	}
	
	public void deleteLast() {
		if (head == null ){
			System.out.println("LinkedList is Empty");
			return;
		}
		if (head.getNext() == null) {
			head = null;
			return;
		}
		node2 iter = head;
		while(iter.getNext().getNext() != null) {
			iter = iter.getNext();
		}
		iter.setNext(null);
	}
	
	private node2 reversell (node2 head) {
		if(head == null || head.getNext() == null) {
			return head;
		}
		node2 newHead = reversell(head.getNext());
		head.getNext().setNext(head);
		head.setNext(null);
		return newHead;
	}
	public void reverseRev() {
		head = reversell(head);
		return;
	}

	
	public void display() {
		if (head == null){
			System.out.println("LinkedList is Empty:");
			return;
		}
		node2 iter = head;
		while(iter != null) {
			System.out.print(iter.getData()+" --> ");
			iter = iter.getNext();
		}
		System.out.print("null");
	}
	
	
	public Student1 findMiddle() {
		if(head == null) {
			return null;
		}
		node2 slow = head;
		node2 fast = head;
		while(fast != null && fast.getNext() != null) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		return slow.getData();
	}
	
	public void displayAlternate() {

	    if (head == null) {
	        System.out.println("Linked List is Empty");
	        return;
	    }

	    node2 iter = head;

	    while (iter != null) {

	        Student1 s = iter.getData();

	        // move 2 steps
	        if (iter.getNext() != null) {
	            iter = iter.getNext().getNext();
	        }
	        else {
	            break;
	        }
	    }
	}
	
}
public class StudentMain {
	public static void main(String[] args) {

		Student1 s1 = new Student1(22, "sidd" , 46);
		Student1 s2 = new Student1(32, "Sagar" , 76);
		Student1 s3 = new Student1(22, "sawyam" , 96);
		Student1 s4 = new Student1(28, "aaman" , 36);

		Studll ll = new Studll();
		ll.insertFirst(s1);
		ll.insertFirst(s2);
		ll.insertFirst(s3);
//		ll.insertFirst(s4);
		ll.display();
		System.out.println();
		ll.insertlast(s4);

		ll.display();
		System.out.println();

//		ll.deleteFirst();
//		ll.display();
		System.out.println();
//		ll.reverseRev();
//		ll.display();
//		System.out.println();
//		System.out.println(ll.findMiddle());
		
		ll.displayAlternate();
		ll.display();
		
	}
}
