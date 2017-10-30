package state;

public class SoldOutState implements State{	
	GumballMachine gumballMachine;

	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("매진되었어요.");		
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("이미 알갱이를 뽑으셨습니다.");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("매진되었어요.");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("매진되었어요.");
	}

}
