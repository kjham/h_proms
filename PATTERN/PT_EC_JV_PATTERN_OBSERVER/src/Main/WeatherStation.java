package Main;
import Observer.CurrentConditionsDisplay;
import Observer.WeatherData;

import Observable.*;

// ������ ����

// �߿��� �ҽ��� ���� ��, ��ü�鿡�� �˷��ִ� Ŭ����
// ��, ������ ��ȭ�� �ϳ��� �־.. ��ϵ� ���� ��ü�� ������ ���� ������ �Ѵ�.

public class WeatherStation {

	public static void main(String[] args) {

		// ���� OsberverPattern �� ������ ���� ȣ��
		
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		CurrentConditionsDisplay currentDisplay3 = new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(80,  65,  30.4f);
		weatherData.setMeasurements(82,  70,  29.2f);
		weatherData.setMeasurements(78,  90,  29.2f);
		
		System.out.println("---------------------------------------------");
		
		// Java �� ����� Observable �� ������ ���� ȣ��
		// ���� : 
		// 1. interface �� �ƴ� Ŭ������ �����Ǿ� �־�, ���뼺�� ������ ���� (Observable �� ����� �߰��� ���� �����ϱ�)
		// 2. Observer API �ϰ� �� �´� Ŭ������ �����ϴ� ���� �Ұ� (���� ���, ���� ������ ��Ƽ������� �����ϴ� ���� �Ұ�)
		
		WeatherData2 weatherData2 = new WeatherData2();
		CurrentConditionDisplay2 currentDisplay2 = new CurrentConditionDisplay2(weatherData2);
		
		weatherData2.setMeasurements(80,  65,  30.4f);
		weatherData2.setMeasurements(82,  70,  29.2f);
		weatherData2.setMeasurements(78,  90,  29.2f);
				
	}

}
