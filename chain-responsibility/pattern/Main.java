public class Main {

	public static void main() {
		//create chain of responsibility depends
		Handler main = new ConcreteHandler1();
		Handler handler2 = new ConcreteHandler2();
		Handler handler3 = new ConcreteHandler3();
		main.setSuccessor(handler2);
		handler2.setSuccessor(handler3);

		//carry out request to chain
		Request request1 = new Request("Content", Type.TYPE2);
		main.handle(request1); //handler2 will act

		Request request2 = new Request("Content", Type.TYPE4);
		main.handle(request2); //no handler acts
	}
}