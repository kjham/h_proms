package state;

public class GumballMachine {
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;	
	State winnerState;
	
	State state = soldOutState;
	int count = 0;
	
	
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		
		this.count = numberGumballs;
		if(numberGumballs > 0) {
			state = noQuarterState;
		}
	}

	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	
	void setState(State state) {
		this.state = state;
	}
	
	void releaseBall() {
		System.out.println("A gumball comes rolloing out the slot...");
		if(count != 0)
			count = count - 1;
	}
	
	int getCount() {
		return this.count;
	}
	
	State getHasQuarterState() {
		return this.hasQuarterState;
	}
	
	State getNoQuarterState() {
		return this.noQuarterState;
	}
	
	State getSoldState() {
		return this.soldState;
	}
	
	State getSoldOutState() {
		return this.soldOutState;
	}
	
	State getWinnerState() {
		return this.winnerState;
	}
	
	/*
	public void dispense() {
		state.dispense();
	}*/
}
