public class Main {

	public static void main() {
		Client clientClass = new AdapterClass();
		clientClass.operation1(); //runs method1() from Adaptee

		Client clientObject = new AdapterObject();
		clientObject.operation2(); //runs method2() from Adaptee
	}
}