package Main;

import TEMPLATEMETHOD.*;

// 정의
// 메소드에서 알고리즘의 골격을 정의
// 알고리즘의 여러 단계 중 일부는 서브클래스에서 구현
// 템플릿 메소드를 이용하면 알고리즘의 구조가 그대로 유지 됨
// 그리고 서브 클래스에서 특정 단계만 재정의 가능

// 헐리우드 원칙 : 먼저 연락하지 마세요. 저희가 연락 드릴게요.
// 이를 통해 의존성 부패를 방지 가능

// 즉 상위 클래스에 템플릿 메소드가 있음으로.. 서브클래스에게 먼저 연락하지마. 내가할께. 라는 헐리우드 원칙이 성립 됨

public class CaffeinBeverageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaffeinBeverage coffee = new Coffee();
		CaffeinBeverage tea = new Tea();
		
		coffee.prepareRecipe();
		System.out.println("\n");
		tea.prepareRecipe();
	}

}
