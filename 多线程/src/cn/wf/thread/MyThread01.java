package cn.wf.thread;
/**
 * 多线程测试1
 * @author wf
 *
 */

public class MyThread01 implements Runnable {
	private String name;
	
	public MyThread01(String name) {
		super();
		this.name = name;
	}
	

	public String getName() {
		return name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(this.getName());		
		}
	}
	
}
