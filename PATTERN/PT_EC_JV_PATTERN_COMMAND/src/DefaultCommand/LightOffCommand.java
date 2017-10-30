package DefaultCommand;

// 커맨드 패턴을 적용한 Light Off Command
public class LightOffCommand implements Command {
	Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.off();
	}
	
	@Override
	public void undo() {
		light.on();
	}

}
