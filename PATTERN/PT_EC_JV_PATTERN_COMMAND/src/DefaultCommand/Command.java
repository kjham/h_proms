package DefaultCommand;

public interface Command {
	// 커맨드 팬턴은 보통 excute() 메소드로 정의를 한다.
	public void execute();
	public void undo();
}
