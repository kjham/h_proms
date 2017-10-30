package FACADE;

// 어떤 서브시스템의 일련의 인터페이스에 대한 통합된 인터페이스를 제공.
// 퍼사드에서 고수준 인터페이스를 정의하기 때문에 서브시스템을 더 쉽게 사용할 수 있음

// 디자인 패턴 원칙
// 최시 지식 원칙(Principle of Least Knowledge) - 정말 친한 치구하고만 이야기해라  (= 데메테르 원칙)

// 서브클래스를 묶는 역할 뿐이지 않나? 이것도 패턴이라 할 수 있나..;;

public class HomeTheaterFacade {
	Amplifier amp;
	Tuner tuner;
	DvdPlayer dvd;
	CdPlayer cd;
	Projector projector;
	TheaterLights lights;
	Screen screen;
	PopcornPopper popper;
	
	public HomeTheaterFacade(Amplifier amp,
			Tuner tuner,
			DvdPlayer dvd,
			CdPlayer cd,
			Projector projector,
			Screen screen,
			TheaterLights lights,
			PopcornPopper popper) {
		this.amp = amp;
		this.tuner = tuner;
		this.dvd = dvd;
		this.cd = cd;
		this.projector = projector;
		this.screen = screen;
		this.lights = lights;
		this.popper = popper;
	}

}
