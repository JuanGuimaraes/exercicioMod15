package br.com.juan.abstractfactory;

public class FactoryProducer {

	public static CarFactory getFactory(String type) {
        if ("SEDAN".equalsIgnoreCase(type)) {
            return new SedanFactory();
        } else if ("SUV".equalsIgnoreCase(type)) {
            return new SUVFactory();
        }
        throw new IllegalArgumentException("Unknown car type: " + type);
    }
}
