package state;

public class SoldState implements State{	
	GumballMachine gumballMachine;

	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("��� ��ٷ��ּ���. �˸��̰� ������ �ֽ��ϴ�.");		
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("�̹� �˰��̸� �����̽��ϴ�.");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("�����̴� �� ���� �����ּ���.");
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
