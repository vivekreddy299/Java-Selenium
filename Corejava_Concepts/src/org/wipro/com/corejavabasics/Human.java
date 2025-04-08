package org.wipro.com.corejavabasics;

/*
 * @vivek.p@wipro.com
 * 01/04/2025
 * 
 */

public class Human {
	//Properties represent Variables
	
	String name;
	int age;
	String gender;
	String Address;
	double salary;
	
	//Behaviors or actions represents as methods
	public void humanEat() {
		System.out.println("Human Eating");
		
	}
	
	public void humanRun() {
		System.out.println("Human Running");
	}
	
	public void humanJump() {
		System.out.println("Human Jumping");
		
	}

	public static void main(String[] args) {
		
		System.out.println("execution started");
		
		//create object to the class
		//className ref= new className
		Human abhi = new Human();
		
		System.out.println(abhi.name = "Abhishek");
		System.out.println(abhi.age = 24);
		System.out.println(abhi.Address = "Hyderabad");
		System.out.println(abhi.gender = "male");
		System.out.println(abhi.salary = 20000L);
		
		abhi.humanEat();
		abhi.humanRun();
		abhi.humanJump();
		

	}

}
