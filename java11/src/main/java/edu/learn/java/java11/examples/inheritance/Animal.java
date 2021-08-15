package edu.learn.java.java11.examples.inheritance;

public abstract class Animal implements AnimalBehavior{
	

	@Override
	public String eatingHabits() {
		return "Herbivorous";
	}

}
