public class Main {

	public static void main() {
		//create components
		Composite composite1 = new Composite();
		Composite composite2 = new Composite();
		Leaf leaf1 = new Leaf();
		Leaf leaf1 = new Leaf();
		Leaf leaf1 = new Leaf();

		//create tree structure
		composite2.addChild(leaf2);
		composite2.addChild(leaf3);
		composite1.addChild(leaf1);
		composite1.addChild(composite2);

		//do some action
		composite1.action(); //do action for every child in composite1
	}
}