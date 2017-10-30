package main;

import composite.*;

public class MenuTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuComponent pancakeHouseMenu = new Menu("팬케이스 하우스 메뉴", "아침 메뉴");
		MenuComponent dinnerMenu = new Menu("객체마을 식당 메뉴", "점심 메뉴");
		MenuComponent cafeMenu = new Menu("카페 메뉴", "저녁 메뉴");
		MenuComponent dessertMenu = new Menu("디저트 메뉴", "디저트를 즐겨 보세요!");

		MenuComponent allMenus = new Menu("전체 메뉴", "전체 메뉴");
		
		pancakeHouseMenu.add(new MenuItem("아침메뉴~", "바삭바삭한 크러스트", true, 1.59));
		dinnerMenu.add(new MenuItem("점심메뉴~", "마리나라 소스 스파게티", true, 3.89));
		cafeMenu.add(new MenuItem("저녁메뉴~", "바삭바삭한 크러스트", true, 1.59));		
		dessertMenu.add(new MenuItem("간식타임!", "바삭바삭한 크러스트", true, 1.59));
		
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinnerMenu);
		allMenus.add(cafeMenu);
		dinnerMenu.add(dessertMenu);
		
		Waitress waitress = new Waitress(allMenus);
		
		waitress.printMenu();
		
		waitress.printBegetarianMenu();
	}

}
