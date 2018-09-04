public class Main {
	
	public static void main() {
		Mediator mediator = new ConcreteMediator();

		//create colleagues and register
		Colleague colleague1 = new Colleague1(mediator);
		Colleague colleague2 = new Colleague2(mediator);
		Colleague colleague3 = new Colleague3(mediator);

		colleague1.setText("Example"); //only colleague2 receive text
	}
}