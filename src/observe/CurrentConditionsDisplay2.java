package observe;
//观察者，所有的观察者都要实现Observe接口
public class CurrentConditionsDisplay2 implements Observe, DisplayElement{
	private float temp;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	public CurrentConditionsDisplay2(Subject weatherData) {
		this.weatherData = weatherData;
//		this.weatherData.registerObserve(this);
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
//		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	@Override
	public void display() {
		System.out.println("humidity1:" + humidity + "pressure1" + pressure);
		
	}

}
