package Observable;

import java.util.Observable;

public class WeatherData2 extends Observable{
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData2() {
		// TODO Auto-generated constructor stub
	}
	
	public void measurementChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}
	
	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity(){
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
}
