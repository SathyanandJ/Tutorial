package edu.learn.java.java11.examples.exception;

/*
 * To Create CheckedException extend Throwable or Exception class
 * To Create UncheckedException extend Error or RunTimeException
 */
public class Main {

	public static void main(String args[]) {
		try {
			new Main().checkedExceptionCreator();
		} catch (DemoCheckedException e) {
			e.printStackTrace();
		}

		new Main().unCheckedExceptionCreator();
	}

	public void checkedExceptionCreator() throws DemoCheckedException {

	}

	public void unCheckedExceptionCreator() throws DemoUncheckedException {

	}

}
