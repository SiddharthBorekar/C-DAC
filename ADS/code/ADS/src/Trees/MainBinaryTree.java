package Trees;

import java.util.LinkedList;
import java.util.Queue;

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

class Binarytree {
	private Node root;

	public Binarytree() {
		root = null;
	}

	public Binarytree(Node root) {
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

	// PreOrder
	public void visitpreorder(Node root) {
		if (root == null)
			return;
		System.out.print(root.getData() + " ");
		visitpreorder(root.getLeft());
		visitpreorder(root.getRight());
	}

	public void preOrder() {
		visitpreorder(root);
	}

	// InOrder
	public void visitinorder(Node root) {
		if (root == null)
			return;
		visitinorder(root.getLeft());
		System.out.print(root.getData() + " ");
		visitinorder(root.getRight());
	}

	public void inorder() {
		visitinorder(root);
	}

	// PostOrder
	public void visitpostOrder(Node root) {
		if (root == null)
			return;
		visitpostOrder(root.getLeft());
		visitpostOrder(root.getRight());
		System.out.print(root.getData() + " ");
	}

	public void postorder() {
		visitpostOrder(root);
	}

	public void displayLevelWise() {
		if (root == null) {
			System.out.println("Empty.....");
			return;
		}

		Queue<Node> q = new LinkedList<Node>();
		q.offer(root);
		Node temp;
		System.out.print("Levelwise: ");
		while (!q.isEmpty()) {
			temp = q.poll();
			System.out.print(temp.getData() + " ");
			if (temp.getLeft() != null) {
				q.offer(temp.getLeft());
			}
			if (temp.getRight() != null) {
				q.offer(temp.getRight());
			}
		}
	}

	public void displayLevelWiseNonLeaf() {
		if (root == null) {
			System.out.println("Empty.....");
			return;
		}

		Queue<Node> q = new LinkedList<Node>();
		q.offer(root);
		Node temp;
		System.out.print("LevelwiseNonLeaf: ");
		while (!q.isEmpty()) {
			temp = q.poll();
			if (temp.getLeft() != null && temp.getRight() != null) {
				System.out.print(temp.getData() + " ");
			}
			if (temp.getLeft() != null) {
				q.offer(temp.getLeft());
			}
			if (temp.getRight() != null) {
				q.offer(temp.getRight());
			}
		}
	}
	
	public int displayLevelWiseNonLeafSum() {
		int sum = 0;
		if (root == null) {
			System.out.println("Empty.....");
			return 0;
		}

		Queue<Node> q = new LinkedList<Node>();
		q.offer(root);
		Node temp;
		System.out.print("LevelwiseNonLeafSum: ");
		while (!q.isEmpty()) {
			temp = q.poll();
			if (temp.getLeft() != null && temp.getRight() != null) {
				sum += temp.getData();
			}
			if (temp.getLeft() != null) {
				q.offer(temp.getLeft());
			}
			if (temp.getRight() != null) {
				q.offer(temp.getRight());
			}
		}
		return sum;
	}
	
	public int displayLevelWiseLeafSum() {
		int sum = 0;
		if (root == null) {
			System.out.println("Empty.....");
			return 0;
		}

		Queue<Node> q = new LinkedList<Node>();
		q.offer(root);
		Node temp;
		System.out.print("LevelwiseLeafSum: ");
		while (!q.isEmpty()) {
			temp = q.poll();
			if (temp.getLeft() == null && temp.getRight() == null) {
				sum += temp.getData();
			}
			if (temp.getLeft() != null) {
				q.offer(temp.getLeft());
			}
			if (temp.getRight() != null) {
				q.offer(temp.getRight());
			}
		}
		return sum;
	}


	public int displayLevelWiseLeafMax() {

		if (root == null) {
			System.out.println("Empty.....");
			return 0;
		}

		Queue<Node> q = new LinkedList<Node>();
		q.offer(root);
		int max = root.getData();
		Node temp;
		System.out.print("LevelwiseLeafMax: ");
		while (!q.isEmpty()) {
			temp = q.poll();
			if (temp.getLeft() == null && temp.getRight() == null) {
				if (max < temp.getData()) {
					max = temp.getData();
				}
			}
			if (temp.getLeft() != null) {
				q.offer(temp.getLeft());
			}
			if (temp.getRight() != null) {
				q.offer(temp.getRight());
			}
		}
		return max;
	}
	
	public int displayLevelWiseLeafMin() {

		if (root == null) {
			System.out.println("Empty.....");
			return 0;
		}

		Queue<Node> q = new LinkedList<Node>();
		q.offer(root);
		int min = root.getData();
		Node temp;
		System.out.print("LevelwiseLeafMin: ");
		while (!q.isEmpty()) {
			temp = q.poll();
			if (temp.getLeft() == null && temp.getRight() == null) {
				if (min > temp.getData()) {
					min = temp.getData();
				}
			}
			if (temp.getLeft() != null) {
				q.offer(temp.getLeft());
			}
			if (temp.getRight() != null) {
				q.offer(temp.getRight());
			}
		}
		return min;
	}
	
	public void displayLevelWiseMaxMin() {
		if (root == null) {
			System.out.println("Empty.....");
			return;
		}

		Queue<Node> q = new LinkedList<Node>();
		q.offer(root);
		int max = root.getData();
		int min = root.getData();
		Node temp;
		System.out.print("Levelwise: ");
		while (!q.isEmpty()) {
			temp = q.poll();
			if(max < temp.getData())
			{
				max = temp.getData();
			}
			if(min > temp.getData())
			{
				min = temp.getData();
			}
			if (temp.getLeft() != null) 
			{
				q.offer(temp.getLeft());
			} 
			if (temp.getRight() != null) {
				q.offer(temp.getRight());
			}
		}
		
		System.out.println("Min: "+min);
		System.out.println("Max: "+max);
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
		System.out.println();
		Bt.inorder();
		System.out.println();
		Bt.postorder();
		System.out.println();
		Bt.displayLevelWise();
		System.out.println();
		Bt.displayLevelWiseNonLeaf();
		System.out.println();
		System.out.println(Bt.displayLevelWiseLeafSum());
		System.out.println(Bt.displayLevelWiseNonLeafSum());
		System.out.println(Bt.displayLevelWiseLeafMin());
		Bt.displayLevelWiseMaxMin();

	}
}
