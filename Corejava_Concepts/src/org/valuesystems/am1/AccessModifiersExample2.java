package org.valuesystems.am1;

public class AccessModifiersExample2 {
	
	public static void main(String[] args) {
		AccessModifiersExample1 am2 = new AccessModifiersExample1();
		am2.name = "Ravi";
		am2.address= "Hyderabad";
		am2.age = 25;
		
		am2.method1();
		am2.method2();
		am2.method3();
	}

}
