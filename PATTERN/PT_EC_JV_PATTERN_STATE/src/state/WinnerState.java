package state;

public class WinnerState implements State{	
	GumballMachine gumballMachine;

	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("잘못된 명령이네요..");		
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("잘못된 명령이네요..");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("잘못된 명령이네요..");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("축하드립니다! 하나 더 !");		
		gumballMachine.releaseBall();
		if(gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}else {
			gumballMachine.releaseBall();
			if(gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			}else {
				System.out.println("Opps, out of gumballs!");
				gumballMachine.setState(gumballMachine.getSoldOutState());	
			}
			
		}
		
	}

}
