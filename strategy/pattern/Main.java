public class Main {

	public static void main() {
		Context context = new Context(new ConcreteStrategy1());
		String arg = "args passed to strategy";
		context.run(arg);

		//conditions have changed
		context.setStrategy(new ConcreteStrategy2());
		arg = "new args for strategy";
		context.run(arg);
	}
}