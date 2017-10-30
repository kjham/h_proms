package Observer;
import java.util.ArrayList;
import Observer.*;

//직접 Observer 패턴을 구현한 예
public class WeatherData implements Subject{	// Interface 를 상속받음
	private ArrayList observers;	// Observer 객체를 저장하기 위한 리스트
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList();
	}

	// 옵저버 등록
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
		
	}

	// 옵저버 제거
	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if(i >= 0) {
			observers.remove(i);
		}
		
	}

	// 모든 옵저버의 데이터 변경
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	// 데이터 변경
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	// 기타 WeatherData의 메소드
	// ...

}
