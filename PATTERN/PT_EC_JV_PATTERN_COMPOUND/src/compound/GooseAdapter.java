package compound;

public class GooseAdapter implements Quackable {
	Goose goose;
	Observerable observable;
		
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}
	
	public void notifyObservers() {
		observable.notifyObservers();
	}
	
	public GooseAdapter(Goose goose) {
		this.goose = goose;
		observable = new Observerable(this);
	}
	
	public void quack() {
		goose.honk();
		notifyObservers();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Goose pretending to be a Duck";
	}

}
