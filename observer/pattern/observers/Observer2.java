public class Observer2 implements Observer {
	
	@Override
	public void update(Observable observable, Object object) {
		if(observable instanceof ConcreteObservable) {
			if(object instanceof Event) {
				//do some work
			}
		}
	}

	//other methods
}