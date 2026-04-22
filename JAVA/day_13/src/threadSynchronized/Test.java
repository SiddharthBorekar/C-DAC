package threadSynchronized;

public class Test {
	public static void main(String[] args) throws InterruptedException{
		
		Account A =  new Account();
		
		MyThread1 t1 = new MyThread1(a);
		MyThread1 t2 = new MyThread1(A);
		
		t1.start();
		t2.start();
		
		Thread.sleep(5000);
		System.out.println("Balance :"+a.getBalance());
	}
}
