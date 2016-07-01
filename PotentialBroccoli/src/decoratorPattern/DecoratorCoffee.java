package decoratorPattern;

public abstract class DecoratorCoffee implements Coffee {
	
    protected final Coffee decoratedCoffee;

	public DecoratorCoffee(Coffee deCoffee) {
		// TODO Auto-generated constructor stub
		this.decoratedCoffee = deCoffee;
	}

	@Override
	public double getCost() {
		return decoratedCoffee.getCost();
	}

	@Override
	public String getIngredients() {
		return decoratedCoffee.getIngredients();
	}

}
