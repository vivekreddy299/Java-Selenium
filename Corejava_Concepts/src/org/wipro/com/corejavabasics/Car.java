package org.wipro.com.corejavabasics;

public class Car {
	
	String make;
	String model;
	String color;
	
	int manf_year;
	double mileage;
	
	public void startEngine() {
		System.out.println("Engine started");
	}
	
	public void accelerate() {
		System.out.println("Accelerating");
	}
	
	public void brake() {
		System.out.println("Brakes applied");
	}

	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		System.out.println("Make of the car is: "+(car1.make = "Toyota"));
		car1.model = "innova";
		car1.color = "Black";
		car1.manf_year = 2012;
		car1.mileage = 25;
		
		car1.startEngine();
		car1.accelerate();
		car1.brake();

	}

}
