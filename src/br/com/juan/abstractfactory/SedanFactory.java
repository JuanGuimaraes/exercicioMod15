package br.com.juan.abstractfactory;

public class SedanFactory implements CarFactory{

	@Override
	public Car createCar() {
		return new Sedan("1.6L Turbo", 5, true);
	}

}
