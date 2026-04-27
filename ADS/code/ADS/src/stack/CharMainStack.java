package stack;

import java.util.Scanner;

class CharStack {
	private char arr[];
	private int top;

	public CharStack() {
		top = -1;
		arr = new char[10];
	}

	public CharStack(int s) {
		top = -1;
		arr = new char[s];
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

	public void push(char c) {
		if (isFull()) {
			System.out.println("Overflow");
		} else {
			top++;
			arr[top] = c;
			
		}
	}

	public char pop() {
		char d = '*';
		if (isEmpty()) {
			return d;
		} else {
			d = arr[top];
			top--;
			return d;
		}
	}

	public char peek() {
		char d = '*';
		if (isEmpty()) {
			return d;
		} else {
			d = arr[top];
			return d;
		}
	}
}

public class CharMainStack{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		CharStack cs = new CharStack();
		
		char ch;
		char val;
		
		do {
			System.out.println("Stack for Characters");
			System.out.println("1. push stack");
			System.out.println("2. pop stack");
			System.out.println("3. peek stack");
			System.out.println("4. Exit");
			ch = s.next().charAt(0);
			
			switch(ch) {
			case '1':
				System.out.println("Push character :");
				char c = s.next().charAt(0);
				cs.push(c);
				break;
			case '2':
				val = cs.pop();
				System.out.println("Popped character:"+val);
				break;
			case '3':
				val = cs.peek();
				System.out.println("Peeked character :"+val);
				break;
			case '4':
				break;
			}
		}while(ch != '4');
		s.close();
	}
}
