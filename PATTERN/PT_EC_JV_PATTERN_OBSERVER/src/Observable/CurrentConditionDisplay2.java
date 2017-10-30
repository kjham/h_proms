package Observable;

import java.util.Observable;
import java.util.Observer;
import Observer.DisplayElement;

public class CurrentConditionDisplay2 implements Observer, DisplayElement{
	Observable observable;
	private float temperature;
	private float humidity;
	
	public CurrentConditionDisplay2(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	public void update(Observable obs, Object arg)
	{
		if(obs instanceof WeatherData2) {
			WeatherData2 weatherData = (WeatherData2)obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}
}
