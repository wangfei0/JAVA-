package cn.wf.simplefactory;
/**
 * 简单工厂类
 * @author wf
 *
 */

public class CarFactory02 {
	
	public static Car creatAudi(){
		return new Audi();
	}
	public static Car  creatByd() {
		return new Byd();
	}
}
