package observe;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
//		CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);
		weatherData.addObserver(new CurrentConditionsDisplay(weatherData));
		weatherData.setMeasurements(5, 5, 5);
		

	}

}
