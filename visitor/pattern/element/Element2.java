public class Element2 implements Element {
	
    @Override
    public void accept(Visitor visitor) {
    	visitor.visit(this);
    }

    public void action() {
    	//do some work
    }
}