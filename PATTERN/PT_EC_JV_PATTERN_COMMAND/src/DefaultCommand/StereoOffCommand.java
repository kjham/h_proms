package DefaultCommand;

// Ŀ�ǵ� ������ ������ Light On Command
public class StereoOffCommand implements Command {
	Stereo stereo;
	
	// �����ڷ� ��ü�� ���� ����
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	
	// ���� (Ŀ�ǵ� ������ �������̵�)
	@Override
	public void execute() {
		stereo.off();
	}
	
	public void undo() {
		stereo.on();
	}

}
