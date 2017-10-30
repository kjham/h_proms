package compound;

import java.util.ArrayList;
import java.util.Iterator;

// Composite 패턴 : 객체들로 구성된 컬렉션을 개별 객체하고 똑같은 식으로 다루는 법
public class Flock implements Quackable{
	ArrayList quackers = new ArrayList<>();
	
	public void add(Quackable quacker) {
		quackers.add(quacker);
	}
	
	public void quack() {
		// 이터레이터 패턴 적용
		Iterator iterator = quackers.iterator();
		
		while(iterator.hasNext()) {
			Quackable quacker = (Quackable) iterator.next();
			quacker.quack();
		}
	}
	
	public void registerObserver(Observer observer) {
		// 이터레이터 패턴을 이용해서.. 모든 객체에 옵저버 패턴이 적용되도록 함..
		Iterator iterator = quackers.iterator();
		while(iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();
			duck.registerObserver(observer);
		}
	}
	
	public void notifyObservers() {	}

}
