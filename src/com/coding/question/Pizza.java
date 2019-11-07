package com.coding.question;

public interface Pizza {

	public void cost();
}

class BasicPizza implements Pizza {
	@Override
	public void cost() {
		System.out.println("basic pizza!");
	}

}

class PizzaDecroator implements Pizza {
	private Pizza pizza;

	public PizzaDecroator(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public void cost() {
		this.pizza.cost();
	}

}

class PaneerPizza extends PizzaDecroator {

	public PaneerPizza(Pizza pizza) {
		super(pizza);
	}

	@Override
	public void cost() {
		super.cost();
		System.out.println("Paneer addded!");
	}
}

class NonVeg extends PizzaDecroator {

	public NonVeg(Pizza pizza) {
		super(pizza);
	}

	@Override
	public void cost() {
		super.cost();
		System.out.println("Non Veg added!");
	}

}
