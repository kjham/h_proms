package Main;
import Observer.CurrentConditionsDisplay;
import Observer.WeatherData;

import Observable.*;

// 옵저버 패턴

// 중요한 소식이 있을 때, 객체들에게 알려주는 클래스
// 즉, 데이터 변화가 하나만 있어도.. 등록된 여러 객체에 데이터 변경 수행을 한다.

public class WeatherStation {

	public static void main(String[] args) {

		// 직접 OsberverPattern 로 구현된 구조 호출
		
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		CurrentConditionsDisplay currentDisplay3 = new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(80,  65,  30.4f);
		weatherData.setMeasurements(82,  70,  29.2f);
		weatherData.setMeasurements(78,  90,  29.2f);
		
		System.out.println("---------------------------------------------");
		
		// Java 에 내장된 Observable 로 구현된 구조 호출
		// 단점 : 
		// 1. interface 가 아닌 클래스로 구현되어 있어, 재사용성에 제약이 생김 (Observable 에 기능을 추가할 수는 없으니까)
		// 2. Observer API 하고 잘 맞는 클래스를 구현하는 것이 불가 (예를 들어, 내부 구조를 멀티스레드로 변경하는 것이 불가)
		
		WeatherData2 weatherData2 = new WeatherData2();
		CurrentConditionDisplay2 currentDisplay2 = new CurrentConditionDisplay2(weatherData2);
		
		weatherData2.setMeasurements(80,  65,  30.4f);
		weatherData2.setMeasurements(82,  70,  29.2f);
		weatherData2.setMeasurements(78,  90,  29.2f);
				
	}

}
