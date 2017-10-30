package SingleTon;

// 싱글턴 패턴은.. 동시접근 제어만 잘 하면.. 쉽게 구현할 수 있는 패턴..
// 동시접근 제어로는.. 아래 코드와.. Syncronized 로 제어하는 두 가지 방법이 있음...
// 아래 코드는 Syncronized 로 인해 과부하 현상을 방지하기 위한 발전된 코드라고 보면 됨..
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
