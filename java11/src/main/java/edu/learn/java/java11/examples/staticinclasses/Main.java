package edu.learn.java.java11.examples.staticinclasses;

/*
 * Static variables and their values (primitives or references) defined in the class are stored in PermGen space of memory
 */

public class Main {
	static {

		System.out.println("Hello I am called Initially");
		calledDuringStartUp();
	}

	/*
	 * Static objects can be declared only at the class level
	 */

	static Object object = new Object();
	Student student = new Student();

	public static void main(String args[]) {
		System.out.println(Student.getStudentName());

		/*
		 * 
		 * student.getName(); // Won't Work Cannot Access Non-Static Variables From
		 * static methods
		 */
		Student stud = new Student();
		// Below code won't work
		stud.getStudentName();
	}

	private static void calledDuringStartUp() {
		System.out.println("Hello I am called Initially From Static Block");
	}

}
