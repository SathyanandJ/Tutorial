package edu.learn.java.java11.examples.staticinclasses;

public class Student {
	
	/*
	 * Memory Allocation:
	 * 	Permanent Generation space of heap as they are associated with the class
	 *  Their local variables and the passed argument(s) to them are stored in the stack
	 * 
	 */
	
	public static String getStudentName() {
		return "Sathyanand";
	}
	
	public String getName() {
		return "Sathyanand";
	}

}
