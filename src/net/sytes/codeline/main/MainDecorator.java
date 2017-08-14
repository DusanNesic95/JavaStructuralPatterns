package net.sytes.codeline.main;

import net.sytes.codeline.decorator.Coffee;
import net.sytes.codeline.decorator.SimpleCoffee;
import net.sytes.codeline.decorator.WithChocolate;
import net.sytes.codeline.decorator.WithMilk;

public class MainDecorator {

	private static void printCoffeeInfo(Coffee coffee) {
		System.out.println("Cost: " + coffee.getCost() + ", with ingridients: " + coffee.getIngredients());
	}
	
	public static void main(String[] args) {
		Coffee simpleCoffee = new SimpleCoffee();
		printCoffeeInfo(simpleCoffee);
		
		simpleCoffee = new WithMilk(simpleCoffee);
		printCoffeeInfo(simpleCoffee);
		
		simpleCoffee = new WithChocolate(simpleCoffee);
		printCoffeeInfo(simpleCoffee);
	}

}
