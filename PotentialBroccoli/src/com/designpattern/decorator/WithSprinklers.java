package com.designpattern.decorator;

public class WithSprinklers extends DecoratorCoffee {

	public WithSprinklers(Coffee c) {
		super(c);
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + 0.7;
	}

	@Override
	public String getIngredients() {
		// TODO Auto-generated method stub
		return super.getIngredients() + ", Sprinklers";
	}

	@Override
	public String getCupSize() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
