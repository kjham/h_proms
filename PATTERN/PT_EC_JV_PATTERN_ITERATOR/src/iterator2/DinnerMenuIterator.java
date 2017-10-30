package iterator2;
import java.util.Iterator;

public class DinnerMenuIterator implements Iterator{ 
	MenuItem[] list;
	int position = 0;
	
	public DinnerMenuIterator(MenuItem[] items) {
		this.list = items;
	}
	
	public Object next() {
		MenuItem menuItem = list[position];
		position = position + 1;
		return menuItem;
	}
	
	public boolean hasNext() {
		if(position >= list.length || list[position] == null)
			return false;
		else
			return true;
	}
	
	public void remove() {
		if(position <= 0) {
			throw new IllegalStateException("next()�� �� ���� ȣ������ ���� ���¿��� ������ �� �����ϴ�.");
		}
		
		if(list[position-1] != null) {
			for(int i = position-1; i < (list.length-1); i++)
				list[i] = list[i+1];
		}
		list[list.length-1] = null;
	}
}
