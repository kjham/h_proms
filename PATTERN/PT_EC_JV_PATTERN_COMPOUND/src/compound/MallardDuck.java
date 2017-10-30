package compound;

public class MallardDuck implements Quackable{
	Observerable observable;
	
	public MallardDuck() {
		observable = new Observerable(this);
	}
	
	public void quack() {
		System.out.println("Quack");
		notifyObservers();
	}
	
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}
	
	public void notifyObservers() {
		observable.notifyObservers();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "MallarDuck";
	}
}
