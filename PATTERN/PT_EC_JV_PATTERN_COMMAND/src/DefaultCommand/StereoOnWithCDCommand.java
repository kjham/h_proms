package DefaultCommand;

// 커맨드 패턴을 적용한 Light On Command
public class StereoOnWithCDCommand implements Command {
	Stereo stereo;
	
	// 생성자로 객체를 전달 받음
		
		public StereoOnWithCDCommand(Stereo stereo) {
			this.stereo = stereo;
	}
	
	// 실행 (커맨드 패턴의 오버라이딩)
	@Override
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolumn(11);
	}
	
	public void undo() {
		stereo.off();
	}

}
