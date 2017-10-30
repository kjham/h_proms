package compound;

public class RedheadDuck implements Quackable{
	public void quack() {
		System.out.println("Quack");
		notifyObservers();
	}

	public RedheadDuck() {
		observable = new Observerable(this);
	}
	
	Observerable observable;
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}
	
	public void notifyObservers() {
		observable.notifyObservers();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Redhead";
	}
}
