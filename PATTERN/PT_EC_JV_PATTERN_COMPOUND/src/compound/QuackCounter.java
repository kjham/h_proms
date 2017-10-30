package compound;

// 데코레이터 패턴을 이용한 클래스인데..
// 클래스를 묶어서.. 카운팅 용도로 씀
public class QuackCounter implements Quackable{
	Quackable duck;
	static int numberOfQuack;
	
	public QuackCounter (Quackable duck) {
		this.duck = duck;
	}
	
	public void quack() {
		duck.quack();
		numberOfQuack ++;
	}
	
	public static int getQuack() {
		return numberOfQuack;
	}
	
	
	public void registerObserver(Observer observer) {}
	
	public void notifyObservers() {	}

}
