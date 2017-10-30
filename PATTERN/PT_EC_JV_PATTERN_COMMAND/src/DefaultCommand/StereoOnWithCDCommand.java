package DefaultCommand;

// Ŀ�ǵ� ������ ������ Light On Command
public class StereoOnWithCDCommand implements Command {
	Stereo stereo;
	
	// �����ڷ� ��ü�� ���� ����
		
		public StereoOnWithCDCommand(Stereo stereo) {
			this.stereo = stereo;
	}
	
	// ���� (Ŀ�ǵ� ������ �������̵�)
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
