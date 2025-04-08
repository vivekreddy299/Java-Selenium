package org.wipro.com.datatypesexample;

public class Primitive_Data_Types_HW {
	
	double num1 = 222;
	double num2 = 333;
	double result;
	
	public void performAdd() {
		System.out.println("Addition of two numbers = "+(num1+num2));
	}
	
	public void performSub() {
		System.out.println("Subtraction of two numbers = "+(num1-num2));
	}
	
	public void multiply() {
		System.out.println("Multiplication of two numbers = "+(num1*num2));
	}
	
	public void division() {
		System.out.println("Division of two numbers = "+(num1/num2));
	}
	

	public static void main(String[] args) {
		Primitive_Data_Types_HW p1 = new Primitive_Data_Types_HW();
		
		p1.performAdd();
		p1.performSub();
		p1.multiply();
		p1.division();

	}

}
