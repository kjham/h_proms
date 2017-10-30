package iterator;

public class DinnerMenu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinnerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		
		addItem("����޴� 1", "���ἳ�� 1", true, 2.99);
		addItem("����޴� 2", "���ἳ�� 2", false, 2.99);
		addItem("����޴� 3", "���ἳ�� 3", false, 3.29);
		addItem("����޴� 4", "���ἳ�� 4", false, 3.05);
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
