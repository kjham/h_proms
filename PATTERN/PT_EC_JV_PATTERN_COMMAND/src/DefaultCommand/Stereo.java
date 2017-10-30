package DefaultCommand;

// 작업 수행 코드는 실제 객체에서 작성
public class Stereo {
	String name;
	
	public Stereo(String name) {
		this.name = name;
	}
	
	public void on() {		
		System.out.println("Stereo in On");
	}	
	
	public void off() {
		System.out.println("Stereo in Off");
	}
	
	public void setCD() {
		System.out.println("CD set to Stereo");
	}
	
	public void setDvd() {
		System.out.println("DVD set to Stereo");
	}
	
	public void setRadio() {
		System.out.println("Radio set to Stereo");
	}
	
	public void setVolumn(int volumn)
	{
		System.out.println("Setero's volumn changed to " + volumn);
	}

}
