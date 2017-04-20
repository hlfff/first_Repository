package observe;

public interface Subject {
	public void registerObserve(Observe o);
	public void unregisterObserve(Observe o);
	public void notifyChange();
	
}
