package decoratorPattern;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	
    public static void printInfo(Coffee c) {
        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients() + "; CupSize: " + c.getCupSize());
    }

	public static void main(String args[]){
		Coffee c = new WithSprinklers(new WithSprinklers(new SimpleCoffee()));
		printInfo(c);
	}
}
