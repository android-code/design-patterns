public class TerminalExpression implements Expression {
	
    //some fields
    private String data;

    @Override
    public boolean interpret(Context context) {
        //do something specific for TerminalExpression e.g. contains text
        return context.getText().contains(data);
    }
}