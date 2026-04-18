package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueDemo {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		System.out.println(q.size());
		
		for(int i=0;i<=9;i++) {
			q.offer(i);
		}
		System.out.println(q);
		
		q.poll();				//Remove first index
		System.out.println(q);
		
		
		System.out.println(q.peek());	//peek 1st element prints
		
		q.offer(10);			//offer is to add stuff
		System.out.println(q);
	}
}
