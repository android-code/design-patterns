public class Main {

	public static void main() {
		//create concrete rule based on brothers expression rule
		Expression areBrothers = getBrothersExpression("Jack", "Johnnie");

		//check if input implements the rule
		areBrothers.interpret("Jack is Johnnie's brother"); //true
		areBrothers.interpret("Jack has one brother. His name is John"); //false
	}

	//brothers expression rule
	public static Expression getBrothersExpression(String name1, String name2) {
		Expression person1 = new TerminalExpression(new Context(name1));
		Expression person2 = new TerminalExpression(new Context(name2));
		Expression brother = new TerminalExpression(new Context("brother"));

		Expression names = new NonTerminalExpression(person1, person2);
		return new NonTerminalExpression(names, brothers);
	}
}