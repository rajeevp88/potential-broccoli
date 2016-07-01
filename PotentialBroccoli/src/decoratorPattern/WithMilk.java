package decoratorPattern;

public class WithMilk extends DecoratorCoffee{

	public WithMilk(Coffee c) {
		super(c);
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + 0.5;
	}

	@Override
	public String getIngredients() {
		// TODO Auto-generated method stub
		return super.getIngredients() + ", Milk";
	}
	
	public int encrpytMilk(){
		return 11234;
	}

	@Override
	public String getCupSize() {
		// TODO Auto-generated method stub
		return "tall";
	}
	
	

}
