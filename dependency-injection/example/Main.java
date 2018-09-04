public class Main {

	private boolean isInternetConnection;
	//set value

	public static void main() {
		ComponentWithLogs component;
		if(isInternetConnection)
		    component = new ComponentWithLogs(new NetworkLogger());
		else
		    component = new ComponentWithLogs(new FileLogger());

		//test class
		ComponentWithLogs componentTest = new ComponentWithLogs(new MockLogger());
	}
}