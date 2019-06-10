package cn.wf.singleton;

/**
 * 饿汉式单例模式,天然线程安全（没有延时加载的优势），方法调用效率高
 * @author wf
 *
 */

public class SingletonDemo01 {
	//类初始化时，立即加载这个对象
	private static SingletonDemo01 instance = new SingletonDemo01();
	
	private SingletonDemo01() {
	}
	public static SingletonDemo01 getInstance() {
		return instance;
	}

}
