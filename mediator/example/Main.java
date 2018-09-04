public class Main {

	public static void main() {
		Mediator chat = new Chat();
		Colleague admin = new Admin(chat);
		Colleague user1 = new User("user1", chat);
		Colleague user2 = new User("user2", chat);
		Colleague user3 = new User("user3", chat);

		admin.sendMessage("Message for all users"); //all users receive message
		user1.sendMessage("Hey", "user2"); //only user2 receives message
		user2.sendMessage("Hey, how are you?", "user1"); //only user1 receives message
	}
}