package main;

//import iterator.*;
import iterator2.*;

//쉽게 말해.. 서로 다른 자료구조가 정의된 클래스 상위에 interface 를 정의하여..
//하나의 인터페이스로 접근 가능하도록 구성한 패턴

// 정의
// 컬렉션 구현 방법을 노출시키지 않으면서도 그 집합체 안에 들어있는 모든 항목에 접근할 수 있게 해주는 방법 

public class Main {

	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinnerMenu dinerMenu = new DinnerMenu();
		
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
		
		waitress.printMenu();
	}
}
