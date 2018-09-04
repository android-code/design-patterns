public class Main {

	public static void main() {
		Invoker invoker = new Invoker();
		Command command1 = new Command1();
		Command command2 = new Command2();

		//if user click something
		invoker.setCommand(command1);
		invoker.start();

		//if user click something else
		invoker.setCommand(command2);
		invoker.start();
	}
}