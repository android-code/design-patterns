public class NonTerminalExpression implements Expression {
	
	private TerminalExpression expression1;
	private TerminalExpression expression2;

	public NonTerminalExpression(TerminalExpression expr1, TerminalExpression expr2) {
		this.expression1 = expr1;
		this.expression2 = expr2;
	}

	@Override
	public boolean interpret(Context context) {
		//do something specific for NonTerminalExpression e.g. AndExpression
		return expression1.interpret(context) && expression2.interpret(context);
	}
}