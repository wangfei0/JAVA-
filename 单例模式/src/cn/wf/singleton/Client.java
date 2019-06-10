package cn.wf.singleton;

public class Client {

	public static void main(String[] args) {
		SingletonDemo02 s1 = SingletonDemo02.getInstance();
		SingletonDemo02 s2 = SingletonDemo02.getInstance();
		System.out.println(s1);
		System.out.println(s2);
	}

}
