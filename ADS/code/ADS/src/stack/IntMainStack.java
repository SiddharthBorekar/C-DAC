package stack;

import java.util.Scanner;

class IntStack {
	private int arr[];
	private int top;

	public IntStack() {
		arr = new int[10];
		top = -1;
	}

	public IntStack(int s) {
		arr = new int[s];
		top = -1;
	}

	public boolean isFull() {
		if (top == arr.length - 1)
			return true;
		else
			return false;
	}

	public boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}
	
	public void push(int n) {
		if (isFull()) {
			System.out.println("Overflow");
		} else {
			top++;
			arr[top] = n;	
		}
	}
	
	public int pop() {
		int d = -999;
		if (isEmpty()) {
			return d;
		} else {
			d = arr[top];
			top--;
			return d;
		}
	}

	public int peek() {
		int d = -999;
		if (isEmpty()) {
			return d;
		} else {
			d = arr[top];
		
			return d;
		}
	}
}

public class IntMainStack {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		IntStack ist = new IntStack();
		char ch;
		int num;
		
		do {	
			System.out.println("Stack For Integer:");
			System.out.println("Enter Choice ");
			System.out.println("1. Push in stack");
			System.out.println("2. Pop in stack");
			System.out.println("3. Peek in stack");
			System.out.println("4. Exit");
			ch = s.next().charAt(0);
			 
			switch (ch) {
			case '1':
				System.out.println("Push Number: ");
				int no = s.nextInt();
				ist.push(no);
				break;
			case '2':
				num = ist.pop();
				System.out.println("Popped Element " + num);
				break;
			case '3':
				num = ist.peek();
				System.out.println("Peek Element " + num);
				break;
			case '4':
				break;
			default:
				System.out.println("Enter valid number");

			}
		} while (ch != '4');

		s.close();
	}
}

