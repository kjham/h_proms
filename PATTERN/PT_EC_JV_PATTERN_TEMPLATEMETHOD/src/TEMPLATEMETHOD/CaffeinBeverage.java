package TEMPLATEMETHOD;

public abstract class CaffeinBeverage {
	
	// 이 메소드를 템플릿 메소드라 부른다.
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		
		// 이렇게 템플릿 메소드안에 조건이 있는 것을 후크라고 한다.
		if(customerWantsCondiments() == true)
			addCondiments();
	}
	
	abstract void brew();
	
	abstract void addCondiments();
	
	void boilWater() {
		System.out.println("물 끓이는 중");		
	}
	
	void pourInCup() {
		System.out.println("컵에 따르는 중");
	}
	
	boolean customerWantsCondiments() {
		return true;
	}

}
