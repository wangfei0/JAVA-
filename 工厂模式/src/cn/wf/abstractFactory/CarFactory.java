package cn.wf.abstractFactory;
/**
 * 汽车工厂接口
 * @author wf
 *
 */

public interface CarFactory {
	Engine createEngine();
	Seat createSeat();
	Tyre createTyre();
}
