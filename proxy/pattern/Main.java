public class Main {

	public static void main() {
		Subject subject = new ConreteSubject();
		subject.action(); //always execute

		Subject proxy = new Proxy();
		proxy.action(); //will not effect
		proxy.setPassword("password");
		proxy.action(); //do action
	}
}