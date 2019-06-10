package cn.wf.simplefactory;
/**
 * 测试有简单工厂模式的情况
 * @author wf
 *
 */

public class Client03 {
	/**
	 * 主函数
	 * @param args
	 */
	public static void main(String[] args) {
		Car c1 =CarFactory02.creatAudi();
		Car c2 =CarFactory02.creatByd();
		
		c1.run();
		c2.run();
	}

}
