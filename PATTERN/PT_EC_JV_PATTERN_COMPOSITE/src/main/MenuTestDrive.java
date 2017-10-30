package main;

import composite.*;

public class MenuTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuComponent pancakeHouseMenu = new Menu("�����̽� �Ͽ콺 �޴�", "��ħ �޴�");
		MenuComponent dinnerMenu = new Menu("��ü���� �Ĵ� �޴�", "���� �޴�");
		MenuComponent cafeMenu = new Menu("ī�� �޴�", "���� �޴�");
		MenuComponent dessertMenu = new Menu("����Ʈ �޴�", "����Ʈ�� ��� ������!");

		MenuComponent allMenus = new Menu("��ü �޴�", "��ü �޴�");
		
		pancakeHouseMenu.add(new MenuItem("��ħ�޴�~", "�ٻ�ٻ��� ũ����Ʈ", true, 1.59));
		dinnerMenu.add(new MenuItem("���ɸ޴�~", "�������� �ҽ� ���İ�Ƽ", true, 3.89));
		cafeMenu.add(new MenuItem("����޴�~", "�ٻ�ٻ��� ũ����Ʈ", true, 1.59));		
		dessertMenu.add(new MenuItem("����Ÿ��!", "�ٻ�ٻ��� ũ����Ʈ", true, 1.59));
		
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinnerMenu);
		allMenus.add(cafeMenu);
		dinnerMenu.add(dessertMenu);
		
		Waitress waitress = new Waitress(allMenus);
		
		waitress.printMenu();
		
		waitress.printBegetarianMenu();
	}

}
