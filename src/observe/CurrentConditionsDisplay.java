package observe;

import java.util.Observable;
import java.util.Observer;

//观察者，所有的观察者都要实现Observer接口
public class CurrentConditionsDisplay implements Observer, DisplayElement{
	private float temp;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	private Observable observable;
	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
//		this.weatherData.registerObserve(this);
	}
	
//	@Override
//	public void update(float temp, float humidity, float pressure) {
////		this.temp = temp;
//		this.humidity = humidity;
//		this.pressure = pressure;
//		display();
//	}

	@Override
	public void display() {
		System.out.println("humidity:" + humidity + "pressure" + pressure);
		
	}

@Override
public void update(Observable o, Object arg) {
	if(o instanceof WeatherData){
		WeatherData weatherData = (WeatherData) o;
		this.humidity = weatherData.gethumidity();
		this.pressure = weatherData.getpressure();
		display();
	}
	
}

}
