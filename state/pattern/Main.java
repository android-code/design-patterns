public class Main {
	
	public static void main() {
		//start state is State1
		Context context = new Context();

		//user request operation
		context.request(); //State1 handle the action
		//operation is done, state has changed

		//user again request operation many times during the state is changing
		context.request(); //State2 handle the action
		context.request(); //State3 handle the action
		context.request(); //again State1 handle the action
	}
}