package Main;

import DefaultCommand.*;

// Ŀ�ǵ� ���� 

// 1. ������ ĸ��ȭ�� ����
// 2. ĸ��ȭ�� �޼ҵ� ȣ���� �α׿����� �����ϰų� ���(Undo) ������ ���� ���� ����

public class RemoteControlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*/////////// ���� 1 //////////////*/
		// ��� �����ϱ� ���� ��ü
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		// ��ü ����
		Light light = new Light("Living Room");
		
		// ��� ����
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		
		// �۾��� ���� ���Ǹ� �з��Ѵٸ�, ������ ���� ����� �������̽��� ����� ������ �� �ִ�.
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		
		remote.setCommand(lightOff);
		remote.buttonWasPressed();

	}

}
