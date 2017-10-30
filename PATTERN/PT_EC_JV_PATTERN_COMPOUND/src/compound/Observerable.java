package compound;

import java.util.ArrayList;
import java.util.Iterator;

public class Observerable implements QuackObservable{
	ArrayList observers = new ArrayList();
	QuackObservable duck;
	
	public Observerable(QuackObservable duck) {
		this.duck = duck;
	}
	
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void notifyObservers() {
		Iterator iterator = observers.iterator();
		
		while(iterator.hasNext()) {
			Observer observer = (Observer)iterator.next();
			observer.update(duck);
		}
	}
}
