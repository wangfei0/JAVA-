package cn.wf.singleton;

/**
 * 懒汉式单例模式(如何防止反射和反序列化漏洞)
 * @author wf
 *
 */

public class SingletonDemo04 {
	//类初始化时，不加载这个对象（延时加载，真正用时再创建）。
	private static SingletonDemo04 instance;
	//私有化构造器
	private SingletonDemo04() {
		if (instance != null) {
			throw new RuntimeException();
		}
	}
	//方法同步，调用效率低
	public static synchronized SingletonDemo04 getInstance() {
		if (instance == null) {
			instance = new SingletonDemo04();
		}
		return instance;
	}

}
