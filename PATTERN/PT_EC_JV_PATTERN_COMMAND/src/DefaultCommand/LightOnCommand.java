package DefaultCommand;

// 커맨드 패턴을 적용한 Light On Command
public class LightOnCommand implements Command {
	Light light;
	
	// 생성자로 객체를 전달 받음
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	// 실행 (커맨드 패턴의 오버라이딩)
	@Override
	public void execute() {
		light.on();
	}
	
	@Override
	public void undo() {
		light.off();
	}

}
