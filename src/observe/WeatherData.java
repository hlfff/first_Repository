package observe;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable{
	private ArrayList observes;
	private float temp;
	private float humidity;
	private float pressure;
	public  WeatherData() {
		observes = new ArrayList();
	}
	
//	@Override
//	public void registerObserve(Observe o) {
//		observes.add(o);
//		
//	}
//
//	@Override
//	public void unregisterObserve(Observe o) {
//		int a = observes.indexOf(o);
//		if(a >= 0){
//			observes.remove(o);
//		}
//	}
//
//	@Override
//	public void notifyChange() {
//		for(int i = 0; i < observes.size(); i++){
//			Observe observe = (Observe) observes.get(i);
//			observe.update(temp, humidity, pressure);
//		}
//		
//	}
	public void measurementsChanged(){
		//java内置的观察者模式，需要调用此方法，通知需要改变，才能去通知观察者更新数据，此方法在我们需要改变时调用，增加灵活性
		setChanged();
		notifyObservers();
//		notifyChange();
	}
	public void setMeasurements(float temp,float humidity,float pressure){
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	public float getTemp(){
		return temp;
	}
	public float gethumidity(){
		return humidity;
	}
	public float getpressure(){
		return pressure;
	}
}
