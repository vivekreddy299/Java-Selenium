package org.valuesystems.am1;

public class AccessModifiersExample1 {
	
	int age;
	
	public String name;
	protected String address;
	private double salary;
	
	void method1() {
		System.out.println("Default method");
	}
	
	public void method2() {
		System.out.println("Public method");
	}
	
	protected void method3() {
		System.out.println("Protected method");
	}
	
	private void method4() {
		System.out.println("Private method");
	}

	public static void main(String[] args) {
		AccessModifiersExample1 am1 = new AccessModifiersExample1();
		am1.address = "hyd";
		am1.age = 25;
		am1.name = "Abhishek";
		am1.salary = 150000;

		am1.method1();
		am1.method2();
		am1.method3();
		am1.method4();
	}

}
