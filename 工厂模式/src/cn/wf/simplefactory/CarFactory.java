package cn.wf.simplefactory;
/**
 * 工厂类
 * @author wf
 *
 */

public class CarFactory {
	
	public static Car creatCar(String type) {
		if ("奥迪".equals(type)) {
			return new Audi();
		}else if ("比亚迪".equals(type)) {
			return new Byd();
		}else {
			return null;
		}
	}

}
