package br.com.juan.abstractfactory;

public class SUV implements Car{
	 
	 private final String engine;
	    private final int seatingCapacity;
	    private final boolean allWheelDrive;

	    public SUV(String engine, int seatingCapacity, boolean allWheelDrive) {
	        this.engine = engine;
	        this.seatingCapacity = seatingCapacity;
	        this.allWheelDrive = allWheelDrive;
	    }

	    @Override
	    public void assemble() {
	        System.out.println("Assembling an SUV car.");
	    }

	    @Override
	    public void showFeatures() {
	        System.out.println("SUV Features:");
	        System.out.println("- Engine: " + engine);
	        System.out.println("- Seating Capacity: " + seatingCapacity);
	        System.out.println("- All-Wheel Drive: " + (allWheelDrive ? "Yes" : "No"));
	    }
}
