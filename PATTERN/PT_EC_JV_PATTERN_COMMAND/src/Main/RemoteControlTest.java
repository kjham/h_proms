package Main;

import DefaultCommand.*;

// 커맨드 패턴 

// 1. 강력한 캡슐화가 가능
// 2. 캡슐화된 메소드 호출을 로그용으로 저장하거나 취소(Undo) 구현을 위한 재사용 가능

public class RemoteControlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*/////////// 예제 1 //////////////*/
		// 대상에 접근하기 위한 객체
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		// 객체 선언
		Light light = new Light("Living Room");
		
		// 명령 접근
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		
		// 작업에 대한 정의만 분류한다면, 다음과 같이 공통된 인터페이스로 명령을 수행할 수 있다.
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		
		remote.setCommand(lightOff);
		remote.buttonWasPressed();

	}

}
