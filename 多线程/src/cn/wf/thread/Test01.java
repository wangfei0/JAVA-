package cn.wf.thread;
/**
 * 多线程测试
 * @author wf
 *
 */

public class Test01 {

	public static void main(String[] args) {
		MyThread01 mt1 = new MyThread01("第一个进程");
		MyThread01 mt2 = new MyThread01("第二个进程");
		Thread t1 = new Thread(mt1);
		Thread t2 = new Thread(mt2);
		t1.start();
		t2.start();
	}

}
