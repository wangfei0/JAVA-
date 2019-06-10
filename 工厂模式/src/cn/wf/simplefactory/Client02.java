package cn.wf.simplefactory;
/**
 * 测试有工厂模式的情况
 * @author wf
 *
 */

public class Client02 {
	/**
	 * 主函数
	 * @param args
	 */
	public static void main(String[] args) {
		Car c1 =CarFactory.creatCar("奥迪");
		Car c2 =CarFactory.creatCar("比亚迪");
		
		c1.run();
		c2.run();
	}

}
