package DefaultCommand;

// Ŀ�ǵ� ������ ������ Light On Command
public class LightOnCommand implements Command {
	Light light;
	
	// �����ڷ� ��ü�� ���� ����
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	// ���� (Ŀ�ǵ� ������ �������̵�)
	@Override
	public void execute() {
		light.on();
	}
	
	@Override
	public void undo() {
		light.off();
	}

}
