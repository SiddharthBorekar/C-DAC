package Queue;

import java.util.Scanner;

class CharQueue1 {
	private char[] arr;
	private int front ,rear;
	
	public CharQueue1 () {
		arr = new char [10];
		front = rear = -1;
	}
	
	public CharQueue1(int s) {
		arr = new char [s];
		front = rear = -1;
	}
	public boolean isFull() {
		if(rear == arr.length-1)
			return true;
		else
			return false;
	}
	
	
	public void insertQueu(char d) {
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
	public char delQueue() {
		char d = '*';
		if(isEmpty())
			return d;
		
		d = arr[front];
		front ++;
		return d;
	}
	public char peek() {
		char d = '*';
		if(isEmpty())
			return d;
		
		d = arr[front];
		return d;
	}
}


public class CharQueue {
	public static void main(String[] args) {
		char num;
		char ch;
		
		CharQueue1 iq = new CharQueue1(5);
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
				num = s.next().charAt(0);
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
				System.out.println(iq.peek()+ " is Peak Element ");
				break;
				
			case '4':
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
		}while(ch!=4);	
s.close();
	}
}

