public class Main {

	public static void main() {
		//setup container
		List<String> persons = new ArrayList<>();
		persons.add("John Black");
		persons.add("Joe Smith")
		persons.add("Frank Jones");
		persons.add("Tom Shaw");
		persons.add("Patrick Jones");
		Container container = new Container1(persons);

		//iterate and do action for every elements of container
		Iterator<String> iterator = container.getIterator();
		ConcreteContainer container = new ConcreteContainer();
		while(iterator.hasNext()) {
		    //do some action on the object
		    String person = iterator.next();
		    if(person.contains("Jones"))
		        iterator.remove(); //delete person and iterate forward
		    else {
		        //do some action
		    }
		}
	}
}