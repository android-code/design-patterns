public class Observer1 implements Observer {
	
	@Override
	public void update(Observable observable, Object object) {
		if(observable instanceof ConcreteObservable) {
			//do some work
		}
		else {
			//do some work
		}
	}

	//other methods
}