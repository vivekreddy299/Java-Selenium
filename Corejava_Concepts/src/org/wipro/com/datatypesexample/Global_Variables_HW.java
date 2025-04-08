package org.wipro.com.datatypesexample;

public class Global_Variables_HW {
	
	static double num1 = 222;
	static double num2 = 333;
	static double result;
	
	public static void performAdd() {
		System.out.println("Addition of two numbers = "+(num1+num2));
	}
	
	public static void performSub() {
		System.out.println("Subtraction of two numbers = "+(num1-num2));
	}
	
	public static void multiply() {
		System.out.println("Multiplication of two numbers = "+(num1*num2));
	}
	
	public static void division() {
		System.out.println("Division of two numbers = "+(num1/num2));
	}

	public static void main(String[] args) {
		
		performAdd();
		performSub();
		multiply();
		division();
	}

}
