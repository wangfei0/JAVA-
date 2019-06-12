package cn.wf.thread;

public class Test02 implements Runnable {

	private int BZ = 10;

	@Override
	public synchronized void run() {
		while (BZ > 0) {
			BZ-=1;
			System.out.println(BZ);
		}
		
	}
	
	public static void main(String[] args) {
		Test02 t1 = new Test02();
		Thread t11 = new Thread(t1);
		Thread t12 = new Thread(t1);
		Thread t13 = new Thread(t1);
		t11.start();
		t12.start();
		t13.start();

	}
	
}
