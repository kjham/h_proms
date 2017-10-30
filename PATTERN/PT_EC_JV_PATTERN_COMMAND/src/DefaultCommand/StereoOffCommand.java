package DefaultCommand;

// 커맨드 패턴을 적용한 Light On Command
public class StereoOffCommand implements Command {
	Stereo stereo;
	
	// 생성자로 객체를 전달 받음
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	
	// 실행 (커맨드 패턴의 오버라이딩)
	@Override
	public void execute() {
		stereo.off();
	}
	
	public void undo() {
		stereo.on();
	}

}
