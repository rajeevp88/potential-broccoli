package com.designpattern.decorator;

public class SimpleCoffee implements Coffee {

	@Override
	public synchronized double getCost() {
		return 1;
	}

	@Override
	public String getIngredients() {
		return "coffee";
	}

	@Override
	public String getCupSize() {
		// TODO Auto-generated method stub
		return null;
	}

}
