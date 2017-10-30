package Decorator;

public class Soy extends CondimentDecorator{
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", ����";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .16 + beverage.cost();
	}
}
