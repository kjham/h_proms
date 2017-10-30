package iterator2;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu{
	ArrayList<MenuItem> menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
		
		addItem("ÆÒÄÉÀÌÅ© 2-1", "¼³¸í 1", true, 2.99);
		addItem("ÆÒÄÉÀÌÅ© 2-2", "¼³¸í 2", false, 2.99);
		addItem("ÆÒÄÉÀÌÅ© 2-3", "¼³¸í 3", true, 3.49);
		addItem("ÆÒÄÉÀÌÅ© 2-4", "¼³¸í 4", true, 3.59);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}	
	
	public Iterator createIterator() {
		return menuItems.iterator();
	}

}
