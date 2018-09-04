public class Main {

	public static void main() {
		//create prototype to copy
		Prototype1 prototype1 = new Prototype1(10.0);
		Prototype2 prototype2 = new Prototype2(5, new Complex(3, true));

		//copy prototypes to save time and resources
		List<Prototype> clones = new ArrayList<>();
		Prototype1 clone1 = prototype1.copy();
		clones.add(clone1);
		Prototype2 clone2 = prototype2.copy();
		clones.add(clone2);
		//do more clones

		//do some action for every copies
		for(Prototype copy : clones)
		    copy.action();
		}
}