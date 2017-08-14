package net.sytes.codeline.decorator;

public class WithChocolate extends CoffeeDecorator {

	public WithChocolate(Coffee coffee) {
		super(coffee);
	}

	@Override
	public double getCost() {
		return super.getCost() + 0.7;
	}

	@Override
	public String getIngredients() {
		return super.getIngredients() + ", Chocolate";
	}
	
}
