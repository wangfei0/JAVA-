package cn.wf.abstractFactory;
/**
 * 高端汽车工厂
 * @author wf
 *
 */

public class LuxuryCarFactory implements CarFactory {

	@Override
	public Engine createEngine() {
		return new LuxuryEngine();
	}

	@Override
	public Seat createSeat() {
		return new LuxurySeat();
	}

	@Override
	public Tyre createTyre() {
		return new LuxuryTyre();
	}

}
