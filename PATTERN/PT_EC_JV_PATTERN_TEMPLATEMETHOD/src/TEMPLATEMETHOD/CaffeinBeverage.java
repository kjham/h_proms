package TEMPLATEMETHOD;

public abstract class CaffeinBeverage {
	
	// �� �޼ҵ带 ���ø� �޼ҵ�� �θ���.
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		
		// �̷��� ���ø� �޼ҵ�ȿ� ������ �ִ� ���� ��ũ��� �Ѵ�.
		if(customerWantsCondiments() == true)
			addCondiments();
	}
	
	abstract void brew();
	
	abstract void addCondiments();
	
	void boilWater() {
		System.out.println("�� ���̴� ��");		
	}
	
	void pourInCup() {
		System.out.println("�ſ� ������ ��");
	}
	
	boolean customerWantsCondiments() {
		return true;
	}

}
