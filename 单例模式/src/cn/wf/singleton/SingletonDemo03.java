package cn.wf.singleton;

/**
 * 静态内部类实现单例模式,
 * 线程安全
 * 方法调用效率高
 * 并且实现了延时加载
 * @author wf
 *
 */

public class SingletonDemo03 {
	//类初始化时，不加载这个对象（延时加载，真正用时再创建）。
	private static class SingletonClassInstance{
		private static final SingletonDemo03 instance = new SingletonDemo03();
	}
	//私有化构造器
	private SingletonDemo03() {
	}
	//方法同步，调用效率低
	public static  SingletonDemo03 getInstance() {
		return SingletonClassInstance.instance;
	}

}
