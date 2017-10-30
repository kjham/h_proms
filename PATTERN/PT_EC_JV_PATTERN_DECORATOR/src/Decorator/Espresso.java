package Decorator;

public class Espresso extends Beverage{

	public Espresso() {
		// TODO Auto-generated constructor stub
		description = "에스프레소";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.99;
	}

}
