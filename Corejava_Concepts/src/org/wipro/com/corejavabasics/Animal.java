package org.wipro.com.corejavabasics;

public class Animal {
	
	String name;
	String classification;
	String age;
	String gender;
	
	public void animalEat() {
		System.out.println("Animal Eating");
	}
	
	public void animalDrink() {
		System.out.println("Animal Drinking");
	}
	
	public void animalRace() {
		System.out.println("Race started");
	}

	public static void main(String[] args) {
		
		Animal animal1 = new Animal();
		
		animal1.name = "Lion";
		animal1.classification = "mammal";
		animal1.age = "12 years";
		animal1.gender= "male";
		
		animal1.animalEat();
		animal1.animalDrink();
		animal1.animalRace();
		
		
		Animal animal2 = new Animal();
		
		System.out.println(animal2.name = "Lizard");
		System.out.println(animal2.classification = "reptile");
		System.out.println(animal2.age = "25 days");
		System.out.println(animal2.gender= "male");
		
		animal2.animalEat();
		animal2.animalDrink();
		animal2.animalRace();
		

	}

}
