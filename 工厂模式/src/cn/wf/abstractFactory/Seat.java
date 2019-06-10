package cn.wf.abstractFactory;
/**
 * 座椅接口
 * @author wf
 *
 */

public interface Seat {
	void massage();
}
class LuxurySeat implements Seat {
	@Override
	public void massage() {
		System.out.println("可以按摩！");
	}
}
class LowSeat implements Seat {
	@Override
	public void massage() {
		System.out.println("不能按摩！");
	}
}