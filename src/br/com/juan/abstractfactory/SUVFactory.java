package br.com.juan.abstractfactory;

public class SUVFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new SUV("2.0L V8", 7, true);
	}
	
}
