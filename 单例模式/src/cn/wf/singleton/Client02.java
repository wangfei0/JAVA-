package cn.wf.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 测试反射和反序列化破解单例模式
 * @author 王飞
 *
 */

public class Client02 {
	/**
	 * 主函数
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 * @throws Exception 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/**
		 * 实例化对象
		 */
		SingletonDemo04 s1 = SingletonDemo04.getInstance();
		SingletonDemo04 s2 = SingletonDemo04.getInstance();
		/**
		 * 打印输出对象的引用
		 */
		System.out.println(s1);
		System.out.println(s2);
		/**
		 * 反射
		 */
//		Class<SingletonDemo04> clazz = (Class<SingletonDemo04>) Class.forName("cn.wf.singleton.SingletonDemo04");
//		Constructor<SingletonDemo04> c = clazz.getDeclaredConstructor(null);
//		c.setAccessible(true);
//		SingletonDemo04 s3 = c.newInstance();
//		SingletonDemo04 s4 = c.newInstance();
//		
//		System.out.println(s3);
//		System.out.println(s4);
		
		//通过反序列化的方式构造多个对象
		FileOutputStream fos = new FileOutputStream("a.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.close();
		fos.close();
		
		//反序列化
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
		SingletonDemo04 s3 = (SingletonDemo04) ois.readObject();
		System.out.println(s3);
	}

}