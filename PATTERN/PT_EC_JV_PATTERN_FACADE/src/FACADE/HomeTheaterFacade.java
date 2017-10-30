package FACADE;

// � ����ý����� �Ϸ��� �������̽��� ���� ���յ� �������̽��� ����.
// �ۻ�忡�� ����� �������̽��� �����ϱ� ������ ����ý����� �� ���� ����� �� ����

// ������ ���� ��Ģ
// �ֽ� ���� ��Ģ(Principle of Least Knowledge) - ���� ģ�� ġ���ϰ� �̾߱��ض�  (= �����׸� ��Ģ)

// ����Ŭ������ ���� ���� ������ �ʳ�? �̰͵� �����̶� �� �� �ֳ�..;;

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
