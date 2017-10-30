package main;

import compound.*;

// 컴파운드 패턴 코드..
// 컴파운드 패턴은.. 여러 패턴을 응용하여 같이 사용하는 패턴을 칭함..
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
		
		// 추상 팩토리를 사용하여 캡슐화 진행
		Quackable mallardDuck = defaultFactory.createMallardDuck();
		Quackable redheadDuck = defaultFactory.createRedheadDuck();
		Quackable duckCall = defaultFactory.createDuckCall();
		Quackable rubberDuck = defaultFactory.createRubberDuck();		
		
		// Adapter 패턴으로 거위를 오리의 인터페이스로 동작하도록 함
		Quackable gooseDuck = new GooseAdapter(new Goose());
		
		System.out.println("\nDuck Simulator: With Decorator - Flocks");
		
		// 컴포지트 패턴을 이용해서... 객체를 묶여 하나처럼 사용
		Flock flockOfDucks = new Flock();
		
		flockOfDucks.add(mallardDuck);
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);
				
		// 컴포지트 패턴 하위에.. 또 컴포지트 패턴을 사용한 예..
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
		
		// Observer 패턴 적용
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
		
		// Decorator 패턴으로 감싸서.. 몇 번 소리를 냈는지 추출
		System.out.println("The ducks quacked " + QuackCounter.getQuack() + " times");
	}
	
	void simulate(Quackable duck) {
		duck.quack();
	}

}
