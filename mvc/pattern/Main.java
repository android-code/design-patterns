public class Main {

	public static void main() {
		Model model = new Model();
		View view = new View(model);
		Controller controller = new Controller(model, view);

		//do some stuff, cach actions and events
		controller.actionRequest();
		//1. controller catched the event
		//2. gets input from view
		//3. delegates the job to model
		//4. info about job status passed to controller
		//5. view is notifed about request finished
		//6. new data loaded from model
	}
}