package Decorator;

public class Whip extends CondimentDecorator{
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", »÷«Œ ≈©∏≤";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .09 + beverage.cost();
	}
}
