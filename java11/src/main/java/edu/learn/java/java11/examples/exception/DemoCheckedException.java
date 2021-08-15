package edu.learn.java.java11.examples.exception;

public class DemoCheckedException extends Exception{
	
	
	public DemoCheckedException(Long errorCode,String message) {
		super(message);
	}

}
