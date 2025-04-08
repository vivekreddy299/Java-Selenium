package org.wipro.com.corejavabasics;

public class TV {
	
	String make;
	double model;
	String color;
	boolean working;
	
	public void turnOn() {
		System.out.println("Please turn on the TV");
	}
	
	public void connectToBox() {
		System.out.println("Connect to settop box");
	}
	
	public void selectChannel() {
		System.out.println("Connection successful. please select a channel");
	}

	public static void main(String[] args) {
	
		TV Tv1 = new TV();
		Tv1.make = "Samsung";
		Tv1.model = 9.0;
		Tv1.color = "Black";
		Tv1.working = false;
		
		if (Tv1.working == true) {
			Tv1.turnOn();
			Tv1.connectToBox();
			Tv1.selectChannel();
		}else{
			System.out.println("TV is not working");
		}
	}

}
