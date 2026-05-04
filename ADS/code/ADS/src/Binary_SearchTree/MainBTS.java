package Binary_SearchTree;

class Node {
	private int data;
	private Node Left , Right;
	
	public Node() {
		data = 0;
		Left = Right = null;
	}
	
	public Node(int data) {
		this.data = data;
		this.Left = null;
		this.Right = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeft() {
		return Left;
	}

	public void setLeft(Node left) {
		Left = left;
	}

	public Node getRight() {
		return Right;
	}

	public void setRight(Node right) {
		Right = right;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", Left=" + Left + ", Right=" + Right + "]";
	}
	
}

class BTS {
	private Node root;
	
	public BTS() {
		root = null;
	}
	
	@Override
	public String toString() {
		return "BTS [root=" + root + "]";
	}

	public void insert_nonrec (int d) {
		Node new_node = new Node(d);
		if (root == null){
			root = new_node;
			return;
			}
		Node iter = root;
		Node par;
		while(iter != null) {
			par = iter;
			if(d < iter.getData()) {
				iter = iter.getLeft();
			}else if(d > iter.getData()) {
				iter = iter.getRight();
			}
			else {
				System.out.println("Duplicate.....");
				return;
			}
			if(d < par.getData())
				par.setLeft(new_node);
			else {
				par.setRight(new_node);
			}
			return;
		}
	}
}

public class MainBTS{
	public static void main(String[] args) {
		BTS bt = new BTS();
		bt.insert_nonrec(45);
		bt.insert_nonrec(50);
		bt.insert_nonrec(41);
		System.out.println(bt);
	}
}



