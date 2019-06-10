package cn.wf.singleton;

/**
 * 懒汉式单例模式,线程安全（没有延时加载的优势），方法调用效率高
 * @author wf
 *
 */

public class SingletonDemo02 {
	//类初始化时，不加载这个对象（延时加载，真正用时再创建）。
	private static SingletonDemo02 instance;
	//私有化构造器
	private SingletonDemo02() {
	}
	//方法同步，调用效率低
	public static synchronized SingletonDemo02 getInstance() {
		if (instance == null) {
			instance = new SingletonDemo02();
		}
		return instance;
	}

}
