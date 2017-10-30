package DefaultCommand;

// 작업 수행 코드는 실제 객체에서 작성
public class Light {
	String name;
	
	public Light(String name) {
		this.name = name;
	}
	
	public void on() {		
		System.out.println(name + "'s Light in On");
	}	
	
	public void off() {
		System.out.println(name + "'s Light in Off");
	}

}
