package cn.wf.abstractFactory;
/**
 * 低端汽车工厂
 * @author wf
 *
 */

public class LowCarFactory implements CarFactory {

	@Override
	public Engine createEngine() {
		return new LowEngine();
	}

	@Override
	public Seat createSeat() {
		return new LowSeat();
	}

	@Override
	public Tyre createTyre() {
		return new LowTyre();
	}

}
