package iterator;

import java.util.ArrayList;

public class PancakeHouseMenu {
	ArrayList<MenuItem> menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
		
		addItem("ÆÒÄÉÀÌÅ© 1", "¼³¸í 1", true, 2.99);
		addItem("ÆÒÄÉÀÌÅ© 2", "¼³¸í 2", false, 2.99);
		addItem("ÆÒÄÉÀÌÅ© 3", "¼³¸í 3", true, 3.49);
		addItem("ÆÒÄÉÀÌÅ© 4", "¼³¸í 4", true, 3.59);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}	
	
	public Iterator createIterator() {
		return new PancakeHouseIterator(menuItems);
	}

}
