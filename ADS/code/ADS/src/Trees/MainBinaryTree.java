package Trees;

class Node {
	private int data;
	private Node left;
	private Node right;

	public Node() {
		data = 0;
		left = null;
		right = null;
	}
	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}
}

class Binarytree{
	private Node root;
	
	public Binarytree() {
		root = null;
	}
	private Binarytree(Node root) {
		this.root = root;
	}
	public Node getRoot() {
		return root;
	}
	public void setRoot(Node root) {
		this.root = root;
	}
	
	public Node createNode(int d) {
		Node new_node = new Node(d);
		return new_node;
	}
	public void visitpreorder(Node root) {
		if(root ==  null)	
			return;
		System.out.print(root.getData()+" ");
		visitpreorder(root.getLeft());
		visitpreorder(root.getRight());
	}
	public void preOrder() {
		visitpreorder(root);
	}
}

public class MainBinaryTree {
	public static void main(String[] args) {
		Binarytree Bt = new Binarytree();
		Bt.setRoot(Bt.createNode(50));
		Bt.getRoot().setLeft(Bt.createNode(17));
		Bt.getRoot().setRight(Bt.createNode(72));
		Bt.getRoot().getLeft().setLeft(Bt.createNode(12));		
		Bt.getRoot().getLeft().getLeft().setLeft(Bt.createNode(9));		
		Bt.getRoot().getLeft().getLeft().setRight(Bt.createNode(14));		
		Bt.getRoot().getLeft().setRight(Bt.createNode(23));
		Bt.getRoot().getLeft().getRight().setRight(Bt.createNode(19));
		Bt.getRoot().getRight().setLeft(Bt.createNode(54));
		Bt.getRoot().getRight().setRight(Bt.createNode(76));
		Bt.getRoot().getRight().getLeft().setLeft(Bt.createNode(67));
		
		
		
		Bt.preOrder();
	}
}
