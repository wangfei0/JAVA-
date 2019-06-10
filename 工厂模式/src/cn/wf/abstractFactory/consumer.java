package cn.wf.abstractFactory;
/**
 * 消费者向工厂购买汽车
 * @author wf
 *
 */

public class consumer {

	public static void main(String[] args) {
		LowCarFactory loeCar = new LowCarFactory();
		Engine e = loeCar.createEngine();
		e.run();
		e.start();
	}

}
