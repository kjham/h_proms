package iterator;

public class DinnerMenu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinnerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		
		addItem("저녁메뉴 1", "저녁설명 1", true, 2.99);
		addItem("저녁메뉴 2", "저녁설명 2", false, 2.99);
		addItem("저녁메뉴 3", "저녁설명 3", false, 3.29);
		addItem("저녁메뉴 4", "저녁설명 4", false, 3.05);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if(numberOfItems >= MAX_ITEMS) {
			System.err.println("죄송합니다. 메뉴가 꽉 찼습니다. 더 이상 추가할 수 없습니다.");			
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
