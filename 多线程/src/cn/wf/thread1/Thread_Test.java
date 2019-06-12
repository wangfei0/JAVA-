package cn.wf.thread1;
/**
 * 多线程同步:同步代码块
 * @author wf
 *
 */

public class Thread_Test  {
	public static void main(String[] args) {
		Thread01 t = new Thread01();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
	}
}
class Thread01 implements Runnable {
	private int tickets = 5;
	@Override
	public void run() {
		while (true) {
			synchronized (this) {
				if (tickets <= 0) {
					break;
				}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"出票"+tickets);
			tickets -= 1;
			}
		}
	}
}
