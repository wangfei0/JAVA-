package cn.wf.thread1;
/**
 * 多线程同步:同步方法
 * @author wf
 *
 */

public class Thread_Test02 {
	public static void main(String[] args) {
		Thread02 t = new Thread02();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
	}
}
class Thread02 implements Runnable {
	private int tickets = 15;
	@Override
	public void run() {
		while (tickets>0) {
			sale();
		}
	}
	
	private synchronized void sale() {
	if (tickets > 0)
	{
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
