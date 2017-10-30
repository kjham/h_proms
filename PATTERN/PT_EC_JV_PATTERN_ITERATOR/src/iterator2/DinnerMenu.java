package iterator2;
import java.util.Iterator;

public class DinnerMenu implements Menu{
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinnerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		
		addItem("����޴� 2-1", "���ἳ�� 1", true, 2.99);
		addItem("����޴� 2-2", "���ἳ�� 2", false, 2.99);
		addItem("����޴� 2-3", "���ἳ�� 3", false, 3.29);
		addItem("����޴� 2-4", "���ἳ�� 4", false, 3.05);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if(numberOfItems >= MAX_ITEMS) {
			System.err.println("�˼��մϴ�. �޴��� �� á���ϴ�. �� �̻� �߰��� �� �����ϴ�.");			
		}
		else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems ++;
		}
	}
	
	public Iterator createIterator() {
		return new DinnerMenuIterator(menuItems);
	}
	

}
