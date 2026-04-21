package thread_Priority;

import java.util.stream.IntStream;

public class Demo {
	public static void main(String[] args) {
		
//		Runnable r = new Runnable() {
//			@Override
//			public void run() {			//1st way of calling Runnable interface
//				int sum = IntStream.rangeClosed(1,10).sum();
//				System.out.println("Sum : "+sum);
//			}
//		};
//		new Thread(r).start();  <-- this line is to call above method
		
		
//		Runnable r = () -> {
//			int sum = IntStream.rangeClosed(1,9).sum();
//			System.out.println("Sum :"+sum);			//second way
//		};
//		new Thread(r).start();
		
		new Thread(() -> {
			int sum = IntStream.rangeClosed(1,10).sum();
			System.out.println("Sum :"+sum);		
		}).start();
		
	}
}
