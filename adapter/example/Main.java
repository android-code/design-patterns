public class Main {

	public static void main() {
		Messenger newMessenger = new Messenger(new MessageProtocolAdapter());
		newMessenger.sendMessage("Message from external library"); //send optimized message and analytics

		Messenger oldMessenger = new Messenger(new MessageProtocol());
		oldMessenger.sendMessage("Message from internal library"); //send only message
	}
}