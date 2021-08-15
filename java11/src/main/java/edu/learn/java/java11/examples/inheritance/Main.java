package edu.learn.java.java11.examples.inheritance;

/*
 * Diamond Problem and multiple inheritance can be achieved in Java 8 + using default method
 */


public class Main {
	public static void main(String args[]) {
		Animal dog = new Dog();
		dog.eatingHabits();
		System.out.println(dog.averageSleepDuration());
		System.out.println(dog.eatingHabits());
		System.out.println("Displays Animal Behavior" + AnimalBehavior.displaysAnimalCharacterstics());
		// Diamond Problem in Java 8+
		PreciousStones stones = new PreciousStones();
		
		System.out.println("Precious Stones Cost:"+stones.cost());
	}
}
