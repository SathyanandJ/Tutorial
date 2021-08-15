package edu.learn.java.java11.examples.inheritance;

public class Dog extends Animal {

	@Override
	public int averageSleepDuration() {
		return 4;
	}
	
	@Override
	public String eatingHabits() {
		return "Omnivorous";
	}
	
}
