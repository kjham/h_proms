package FACOTRY;

public class ChicagoStyleCheesePizza extends Pizza{
	public ChicagoStyleCheesePizza() {
		// TODO Auto-generated constructor stub
		name = "Chicago Style Sauce and Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		
		toppings.add("Shredded Mozzarella Cheese");
	}
	
	void cut() {
		System.out.println("Cutting the pizza into squre slices");
	}
}
