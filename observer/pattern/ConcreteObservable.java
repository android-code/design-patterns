public class ConcreteObservable implements Observable {

	private List<Observer> observers;

	//other fields

	public ConcreteObservable() {
		observers = new ArrayList();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unregisterObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : observers)
			observer.update(this, null);
	}

	@Override
	public void notifyObservers(Object object) {
		for(Observer observer : observers)
			observer.update(this, object);
	}

	public void method1() {
		//do some work
		notifyObservers();
	}

	public void method2() {
		//do some work
		Event event = new Event(); //args wrapped in event
		notifyObservers(event);
	}

	//others methods
}