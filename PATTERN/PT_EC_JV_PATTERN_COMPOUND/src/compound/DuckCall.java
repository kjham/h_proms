package compound;

public class DuckCall implements Quackable{
	Observerable observable;
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}
	
	public DuckCall() {
		observable = new Observerable(this);
	}
	
	public void notifyObservers() {
		observable.notifyObservers();
	}
	
	public void quack() {
		System.out.println("Kwak");
		notifyObservers();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Dcuk Call";
	}

}
