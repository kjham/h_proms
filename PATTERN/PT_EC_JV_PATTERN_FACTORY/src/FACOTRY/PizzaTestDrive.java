package FACOTRY;

// ���丮 ����
// 1. ������ ������ �̿��� ��ü���� ����
// ��, Ȯ�忡 ���ؼ��� ���� �ְ�.. ���濡 ���ؼ��� �����־�� ��

// ��ȭ�� �����ϰ� ��ó�� �� �ִ� �����̶� �� �� �ִ�.

public class PizzaTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		
		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

	}

}
