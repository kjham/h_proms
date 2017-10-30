package state;

import java.util.Random;

public class HasQuarterState implements State{
	GumballMachine gumballMachine;
	Random randomWinner = new Random(System.currentTimeMillis());
	
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("������ �� ���� �־��ּ���.");		
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("������ ��ȯ�˴ϴ�.");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("�����̸� �����̽��ϴ�.");
		int winner = randomWinner.nextInt(10);
		if((winner == 0) && (gumballMachine.getCount()) > 1)
			gumballMachine.setState(gumballMachine.getWinnerState());
		else		
			gumballMachine.setState(gumballMachine.getSoldState());
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("�˸��̰� ���� �� �����ϴ�.");
	}

}
