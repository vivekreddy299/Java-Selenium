package org.wipro.com.datatypesexample;

public class Primitive_Data_Types_Example1 {
	//Global or Instance variables
	int num1 = 10;
	int num2 = 20;
	int result;
	int num3 = 30;
	
	public void performAdd() {
		
		System.out.println("Sum : "+(num1+num2+num3));
		
	}
	
	public void performSub() {
		
		System.out.println("Number 1 minus number 2 :: "+(num1-num2-num3));
		
	}
	
	public void performMul() {
		
		result = num1*num2*num3;
		System.out.println("Number 1 multiply by number 2 :: "+result);
		
	}

	public static void main(String[] args) {
		Primitive_Data_Types_Example1 p1 = new Primitive_Data_Types_Example1();
		p1.performAdd();
		p1.performSub();
		p1.performMul();

	}

}
