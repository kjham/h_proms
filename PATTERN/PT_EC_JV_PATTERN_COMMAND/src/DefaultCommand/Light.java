package DefaultCommand;

// �۾� ���� �ڵ�� ���� ��ü���� �ۼ�
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
