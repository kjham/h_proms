package state;

public class SoldState implements State{	
	GumballMachine gumballMachine;

	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("잠깐만 기다려주세요. 알맹이가 나가고 있습니다.");		
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("이미 알갱이를 뽑으셨습니다.");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("손잡이는 한 번만 돌려주세요.");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		gumballMachine.releaseBall();
		if(gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}else {
			System.out.println("Opps, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
		
	}

}
