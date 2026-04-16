package stack;
import java.util.Stack;
public class StackDemo {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(15);
		s.push(20);
		s.push(25);
		s.push("Sidd");
		s.push("adi");
		s.push("a");
		System.out.println(s);
		
		
		s.pop();
		System.out.println(s);
		System.out.println(s.search("Sidd"));
														//always remember 
		System.out.println(s.search(20));
	}
}
