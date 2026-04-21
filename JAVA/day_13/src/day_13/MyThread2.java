package day_13;

public class MyThread2 implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+""+Thread.currentThread().getState()+""+Thread.currentThread().getId());
	}
	public static void main(String[] args) 
	{
		MyThread2 r1 = new MyThread2();
		Thread t1 = new Thread(r1);
		MyThread2 r2 = new MyThread2();
		Thread t2 = new Thread(r2);
		MyThread2 r3 = new MyThread2();
		Thread t3 = new Thread(r3);

		System.out.println(t1.getState());
		System.out.println(t2.getState());
		System.out.println(t3.getState());

		t1.start();
		t2.start();
		t3.start();

		System.out.println("t1 :"+t1.getState());
		System.out.println("t2 :"+t1.getState());
		System.out.println("t3 :"+t1.getState());
	}
}
