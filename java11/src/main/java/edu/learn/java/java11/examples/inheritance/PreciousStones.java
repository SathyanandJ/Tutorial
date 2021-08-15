package edu.learn.java.java11.examples.inheritance;

public class PreciousStones implements Diamond,Gold {

	@Override
	public int cost() {

		return Gold.super.cost();
	}

	
}
