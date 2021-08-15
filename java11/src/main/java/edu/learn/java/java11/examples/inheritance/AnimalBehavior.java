package edu.learn.java.java11.examples.inheritance;

public interface AnimalBehavior extends Behavior{

	@Override
	public default int averageSleepDuration() {
		return 4;
	}
	
	public static boolean displaysAnimalCharacterstics() {
		return true;
	}
	
	

}
