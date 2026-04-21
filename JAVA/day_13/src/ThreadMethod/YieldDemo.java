package ThreadMethod;

import day_13.MyThread;

public class YieldDemo implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i <= 4; i++) {
			if (i == 2) {
				Thread.yield();
				System.out.println("YieldDemo" + Thread.currentThread().getName() + "" + i);
			}
			else {
				System.out.println(Thread.currentThread().getName() + "" + i);
			}
		}
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new YieldDemo(), "t1");
		Thread t2 = new Thread(new YieldDemo(), "t2");
		Thread t3 = new Thread(new YieldDemo(), "t3");

		t1.start();
		t2.start();
		t3.start();
	}
}
