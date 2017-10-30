package compound;

public class RubberDuck implements Quackable{
	public void quack() {
		System.out.println("Squeak");
		notifyObservers();
	}
	
	public RubberDuck() {
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
		return "Rubber Duck";
	}
}
