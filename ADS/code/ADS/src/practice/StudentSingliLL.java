package practice;

class StudNode {
	protected Student data;
	protected StudNode next;

	StudNode(Student data) {
		this.data = data;
		this.next = null;
	}

	public Student getData() {
		return data;
	}

	public void setData(Student data) {
		this.data = data;
	}

	public StudNode getNext() {
		return next;
	}

	public void setNext(StudNode next) {
		this.next = next;
	}

}

class StudentLL {
	private StudNode head;

	public StudNode getHead() {
		return head;
	}
	
	public void setHead(StudNode head) {
		this.head = head;
	}

	public void insertFirst(Student d) {
		StudNode newStudNode = new StudNode(d);
		if (head == null) {
			head = newStudNode;
			return;
		}
		newStudNode.next = head;
		head = newStudNode;
		return;
	}
	
	public void insertLast(Student d) {
		StudNode newStudNode = new StudNode(d);
		if(head == null) {
			head = newStudNode;
			return;
		}
		StudNode iter = head;
		while(iter.next != null) {
			iter = iter.next; 
		}
		iter.next = newStudNode;
	}
	
	public void deletFirst() {
		if(head == null) {
			System.out.println("LinkList is Empty");
			return;
		}
		head = head.next;
		return;
	}
	
	public void deletLast() {
		if(head == null) {
			System.out.println("LinkList is Empty");
			return;
		}
		if(head.next == null) {
			head = null;
			return;
		}
		StudNode iter = head;
		while(iter.next.next != null) {
			iter = iter.next;
		}
		iter.next= null;
	}
	
	private StudNode reverse(StudNode head) {
	    if (head == null || head.next == null) {
	        return head;
	    }
	    
	    StudNode newHead = reverse(head.next);

	    head.next.next = head;
	    head.next = null;

	    return newHead;
	}
	public void reverseRec() {
	    head = reverse(head);
	}
	
	 
	public Student findMiddle() {
	    if(head == null) {
	    	return null;
	    // detect cycle
	    }
	    StudNode slow = head;
	    StudNode fast = head;
	    while (fast != null && fast.next != null) {
	        slow = slow.next;
	        fast = fast.next.next;

	    }
	    return slow.getData();
	}

	public void 
	
	
	display() {
		if (head == null) {
			System.out.println("List is Empty:");
			return;
		}
		StudNode iter = head;
		while (iter != null) {
			System.out.print(iter.getData()+" --> ");
			iter = iter.getNext();
		}
		System.out.println("Null");
	}
	
	public void printAlternate() {
	    if (head == null) {
	        System.out.println("List is Empty");
	        return;
	    }

	    StudNode iter = head;

	    while (iter != null) {
	        System.out.print(iter.getData() + " -> ");

	        // move 2 steps (skip one node)
	        if (iter.next != null) {
	            iter = iter.next.next;
	        } else {
	            break;
	        }
	    }

	    System.out.println("Null");
	}
	
	public void SwapAlternate() {
		StudNode temp = head;
		Student preserve;
		
		while (temp.next != null) {
			preserve = temp.data;
			temp.data = temp.next.data;
			temp.next.data = preserve;
			temp = temp.next.next;
		}
	}
}

public class StudentSingliLL {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Sidd", 56);
		Student s2 = new Student(2, "Sagar", 86);
		Student s3 = new Student(3, "sai", 20);
		Student s4 = new Student(4, "Aman", 52);
		Student s5 = new Student(5, "Aditya", 78);

		StudentLL li = new StudentLL();
		li.insertFirst(s1);
		li.insertFirst(s2);
		li.insertFirst(s3);

		li.insertLast(s4);
		li.insertLast(s5);
		li.insertLast(s5);

//		li.deletFirst();

//		li.deletLast();

//		li.display();
//		li.reverseRec();
//		li.display();

		li.display();
//		System.out.println(li.findMiddle());

		li.printAlternate();

	}
}
