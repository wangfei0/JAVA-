package cn.wf.abstractFactory;
/**
 * 引擎接口
 * @author wf
 *
 */

public interface Engine {
	void run();
	void start();
}
class LuxuryEngine implements Engine{
	@Override
	public void run() {
		System.out.println("转的快！");		
	}
	@Override
	public void start() {
		System.out.println("启动快！自动起停！！");
	}
}
class LowEngine implements Engine{
	@Override
	public void run() {
		System.out.println("转的慢！");		
	}
	@Override
	public void start() {
		System.out.println("启动慢！不能自动起停！！");
	}
}