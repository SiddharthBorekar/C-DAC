package dsa_stack;

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

	public void push(char n) {
		if (isFull()) {
			System.out.println("Overflow");
		} else {
			top++;
			arr[top] = n;
			
		}
	}

	public boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
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

	public char top() {
		char d = '*';
		if (!(isEmpty())) {
			d = arr[top];
			top--;
		}
		return d;
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
