package br.com.juan.abstractfactory;

import java.util.Scanner;

public class Demo {
	 public static void main(String[] args) {
		 
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to the Car Factory!");
	        System.out.println("Please choose a car type to assemble:");
	        System.out.println("1. Sedan");
	        System.out.println("2. SUV");
	        System.out.print("Enter your choice (1 or 2): ");

	        int choice = scanner.nextInt();

	        CarFactory factory;
	        Car car;

	        switch (choice) {
	            case 1:
	                factory = FactoryProducer.getFactory("SEDAN");
	                car = factory.createCar();
	                break;
	            case 2:
	                factory = FactoryProducer.getFactory("SUV");
	                car = factory.createCar();
	                break;
	            default:
	                System.out.println("Invalid choice. Exiting...");
	                scanner.close();
	                return;
	        }

	        System.out.println();
	        car.assemble();
	        car.showFeatures();

	        scanner.close();
	    }
}
