package Queue;

import java.util.Scanner;

class IntQueue1 {
	private int arr[];
	private int front ,rear;
	
	public IntQueue1 () {
		arr = new int [10];
		front = rear = -1;
	}
	
	public IntQueue1(int s) {
		arr = new int [10];
		front = rear = -1;
	}
	public boolean isFull() {
		if(rear == arr.length-1)
			return true;
		else
			return false;
	}
	
	
	public void insertQueu(int d) {
		if(isFull()) {
			System.out.println("Error : Overflow");
			return;
		}
	
		if(front == -1)	front = 0;
		
		rear = rear + 1;
		arr[rear] = d;
		return;
	}
	
	
	public boolean isEmpty() {
		if((front == -1) || (front  == rear + 1))
			return true;
		else
			return false;
	}
	public int delQueue() {
		int d = -999;
		if(isEmpty())
			return d;
		
		d = arr[front];
		front ++;
		return d;
	}
	public int peek() {
		int d = -999;
		if(isEmpty())
			return d;
		
		d = arr[front];
		return d;
	}
}


public class IntQueue {
	public static void main(String[] args) {
		int num;
		char ch;
		
		IntQueue1 iq = new IntQueue1(5);
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println("Enter Your Choise : ");
			System.out.println("1. insertQueu");
			System.out.println("2. delQueue");
			System.out.println("3. Peek");
			System.out.println("4. Exit");
			ch = s.next().charAt(0);
			
			switch (ch) {
			case '1':
				System.out.println("Enter Number to insertQueu :");
				num = s.nextInt();
				iq.insertQueu(num);
				break;
				
			case '2':
				int n = iq.delQueue();
				if (n != -999) {
					System.out.println("Element delQueue " +n);
				}
				else {
					System.out.println("Queue is Empty!!!");
				}
				break;

			case '3':
				System.out.println(iq.peek()+ "is Peak Element ");
				break;
				
			case '4':
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
		}while(ch!=4);	
	}
}

