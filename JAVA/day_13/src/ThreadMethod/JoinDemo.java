package ThreadMethod;

public class JoinDemo implements Runnable{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println(Thread.currentThread().getName()+""+i);
		}
		try {
			Thread.sleep(500);
		}catch (InterruptedException e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		JoinDemo j1 =new JoinDemo();
		
		Thread t1 = new Thread(j1,"one");
		Thread t2 = new Thread(j1,"two");
		Thread t3 = new Thread(j1,"Three");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
