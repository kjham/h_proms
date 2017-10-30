package compound;

import java.util.ArrayList;
import java.util.Iterator;

// Composite ���� : ��ü��� ������ �÷����� ���� ��ü�ϰ� �Ȱ��� ������ �ٷ�� ��
public class Flock implements Quackable{
	ArrayList quackers = new ArrayList<>();
	
	public void add(Quackable quacker) {
		quackers.add(quacker);
	}
	
	public void quack() {
		// ���ͷ����� ���� ����
		Iterator iterator = quackers.iterator();
		
		while(iterator.hasNext()) {
			Quackable quacker = (Quackable) iterator.next();
			quacker.quack();
		}
	}
	
	public void registerObserver(Observer observer) {
		// ���ͷ����� ������ �̿��ؼ�.. ��� ��ü�� ������ ������ ����ǵ��� ��..
		Iterator iterator = quackers.iterator();
		while(iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();
			duck.registerObserver(observer);
		}
	}
	
	public void notifyObservers() {	}

}
