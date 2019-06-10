package cn.wf.simplefactory;
/**
 * 测试没有工厂模式的情况
 * @author wf
 *
 */

public class Client01 {
	/**
	 * 主函数
	 * @param args
	 */
	public static void main(String[] args) {
		Car c1 = new Audi();
		Car c2 = new Byd();
		
		c1.run();
		c2.run();
	}

}
