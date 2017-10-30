package compound;

// ���ڷ����� ������ �̿��� Ŭ�����ε�..
// Ŭ������ ���.. ī���� �뵵�� ��
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
