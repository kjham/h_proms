package iterator;

import java.util.ArrayList;

public class PancakeHouseMenu {
	ArrayList<MenuItem> menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
		
		addItem("������ũ 1", "���� 1", true, 2.99);
		addItem("������ũ 2", "���� 2", false, 2.99);
		addItem("������ũ 3", "���� 3", true, 3.49);
		addItem("������ũ 4", "���� 4", true, 3.59);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}	
	
	public Iterator createIterator() {
		return new PancakeHouseIterator(menuItems);
	}

}
