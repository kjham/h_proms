package FACOTRY;

// 팩토리 패턴
// 1. 느슨한 결합을 이용한 객체지향 패턴
// 즉, 확장에 대해서는 열려 있고.. 변경에 대해서는 닫혀있어야 함

// 변화에 유용하게 대처할 수 있는 패턴이라 볼 수 있다.

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
