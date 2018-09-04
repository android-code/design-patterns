public class Main {

	public static void main() {
		//get resources from database
		List<Product> products = new ArrayList();

		//add books
		product.add(new Book("Hobbit", 1, "Description", "J.R.R. Tolkien", "15515377", 320));

		//add films
		List<Actor> actors = new ArrayList();
		actors.add(new Actor("Russell Crowe", "Maximus"));
		actors.add(new Actor("Joaquin Phoenix", "Kommodus"))
		product.add(new Film("Gladiator", "Description", "Ridley Scott", "David Franzoni", actors, 2000));

		//add games
		product.add(new Game("Heroes of Might and Magic III", "Description", "Ubisoft", 1000000));

		//generate html files for customers
		FileGenerator visitor = new HtmlGenerator();
		for(Product element : products)
		    element.generateFile(visitor);

		//generate json files for IT
		visitor = new JsonGenerator();
		for(Product element : products)
		    element.generateFile(visitor);
	}
}