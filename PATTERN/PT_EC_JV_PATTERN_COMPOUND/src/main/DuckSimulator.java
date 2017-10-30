package main;

import compound.*;

// ���Ŀ�� ���� �ڵ�..
// ���Ŀ�� ������.. ���� ������ �����Ͽ� ���� ����ϴ� ������ Ī��..
public class DuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuckSimulator simulator = new DuckSimulator();
		
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		AbstractDuckFactory defaultFactory = new DuckFactory();
		
		simulator.simulate(duckFactory, defaultFactory);
	}
	
	void simulate(AbstractDuckFactory duckFactory, AbstractDuckFactory defaultFactory) {
		/*
		Quackable mallardDuck = new QuackCounter(new MallardDuck());
		Quackable redheadDuck = new QuackCounter(new RedheadDuck());
		Quackable duckCall = new QuackCounter(new DuckCall());
		Quackable rubberDuck = new QuackCounter(new RubberDuck());
		*/
		
		// �߻� ���丮�� ����Ͽ� ĸ��ȭ ����
		Quackable mallardDuck = defaultFactory.createMallardDuck();
		Quackable redheadDuck = defaultFactory.createRedheadDuck();
		Quackable duckCall = defaultFactory.createDuckCall();
		Quackable rubberDuck = defaultFactory.createRubberDuck();		
		
		// Adapter �������� ������ ������ �������̽��� �����ϵ��� ��
		Quackable gooseDuck = new GooseAdapter(new Goose());
		
		System.out.println("\nDuck Simulator: With Decorator - Flocks");
		
		// ������Ʈ ������ �̿��ؼ�... ��ü�� ���� �ϳ�ó�� ���
		Flock flockOfDucks = new Flock();
		
		flockOfDucks.add(mallardDuck);
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);
				
		// ������Ʈ ���� ������.. �� ������Ʈ ������ ����� ��..
		Flock flockOfMallards = new Flock();
		
		Quackable mallardOne = duckFactory.createMallardDuck();
		Quackable mallardTwo = duckFactory.createMallardDuck();
		Quackable mallardThree = duckFactory.createMallardDuck();
		Quackable mallardFour = duckFactory.createMallardDuck();
		
		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardFour);
		
		flockOfDucks.add(flockOfMallards);
		
		/*
		System.out.println("\nDuck Simulator: Whole Flock simulation");
		simulate(flockOfDucks);
		
		System.out.println("\nDuck Simulator: Mallard Flock Simulation");
		simulate(flockOfMallards);
		*/
		
		// Observer ���� ����
		System.out.println("\nDuck Simulator: With Observer");
		Quackologist quackologist = new Quackologist();
		flockOfDucks.registerObserver(quackologist);
		
		simulate(flockOfDucks);
		
		
		/*
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);
		*/
		
		// Decorator �������� ���μ�.. �� �� �Ҹ��� �´��� ����
		System.out.println("The ducks quacked " + QuackCounter.getQuack() + " times");
	}
	
	void simulate(Quackable duck) {
		duck.quack();
	}

}
