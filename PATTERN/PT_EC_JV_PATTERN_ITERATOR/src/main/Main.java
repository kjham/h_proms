package main;

//import iterator.*;
import iterator2.*;

//���� ����.. ���� �ٸ� �ڷᱸ���� ���ǵ� Ŭ���� ������ interface �� �����Ͽ�..
//�ϳ��� �������̽��� ���� �����ϵ��� ������ ����

// ����
// �÷��� ���� ����� �����Ű�� �����鼭�� �� ����ü �ȿ� ����ִ� ��� �׸� ������ �� �ְ� ���ִ� ��� 

public class Main {

	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinnerMenu dinerMenu = new DinnerMenu();
		
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
		
		waitress.printMenu();
	}
}
