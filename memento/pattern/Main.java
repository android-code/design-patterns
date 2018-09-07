public class Main {

	public static void main() {
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();

		//first step, no need to add to the history
		originator.setState("State1");

		//next step, need to add to the history
		originator.setState("State2");
		caretaker.add(originator.save()); //State2 has been saved

		//next step, also need to save
		originator.setState("State3");
		caretaker.add(originator.save()); //State3 has been saved

		//next step, no need to save
		originator.setState("State4");

		//user decide to back step so previous state restore
		originator.restore(caretaker.get(caretaker.getSize() - 1));
	}
}