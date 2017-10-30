package iterator;

public class Waitress {
	PancakeHouseMenu pancakeHouseMenu;
	DinnerMenu dinerMenu;
	
	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	public void printMenu() {
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();
		System.out.println("�޴�\n-----\n��ħ �޴�");
		printMenu(pancakeIterator);
		System.out.println("\n���� �޴�");
		printMenu(dinerIterator);
	}
	
	private void printMenu(Iterator iterator){
		while(iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.println(menuItem.getName() + ", ");
			System.out.println(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}

}
