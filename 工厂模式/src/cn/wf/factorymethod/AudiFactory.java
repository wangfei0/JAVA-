package cn.wf.factorymethod;

public class AudiFactory implements CarFactory {
	@Override
	public Car createCar() {
		return new Audi();
	}
}
