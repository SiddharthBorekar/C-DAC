package dsa_stack;

class IntStack {
	private int arr[];
	private int top;

	public IntStack() {
		top = -1;
		arr = new int[10];
	}

	public IntStack(int s) {
		top = -1;
		arr = new int[s];
	}

	public boolean isFull() {
		if (top == arr.length - 1)
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

	public boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
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

	public int top() {
		int d = -999;
		if (!(isEmpty())) {
			d = arr[top];
			top--;
		}
		return d;
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
