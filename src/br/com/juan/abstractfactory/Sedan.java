package br.com.juan.abstractfactory;

public class Sedan implements Car {
	
	private final String engine;
    private final int seatingCapacity;
    private final boolean luxuryPackage;

    public Sedan(String engine, int seatingCapacity, boolean luxuryPackage) {
        this.engine = engine;
        this.seatingCapacity = seatingCapacity;
        this.luxuryPackage = luxuryPackage;
    }

    @Override
    public void assemble() {
        System.out.println("Assembling a Sedan car.");
    }

    @Override
    public void showFeatures() {
        System.out.println("Sedan Features:");
        System.out.println("- Engine: " + engine);
        System.out.println("- Seating Capacity: " + seatingCapacity);
        System.out.println("- Luxury Package: " + (luxuryPackage ? "Yes" : "No"));
    }
	
}
