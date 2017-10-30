package SingleTon;

// �̱��� ������.. �������� ��� �� �ϸ�.. ���� ������ �� �ִ� ����..
// �������� ����δ�.. �Ʒ� �ڵ��.. Syncronized �� �����ϴ� �� ���� ����� ����...
// �Ʒ� �ڵ�� Syncronized �� ���� ������ ������ �����ϱ� ���� ������ �ڵ��� ���� ��..
public class Singleton {
	private volatile static Singleton uniqueInstance;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(uniqueInstance == null) {
			synchronized (Singleton.class) {
				if(uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		
		return uniqueInstance;
	}
}
