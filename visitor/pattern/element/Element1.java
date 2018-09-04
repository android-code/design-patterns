public class Element1 implements Element {
	
    @Override
    public void accept(Visitor visitor) {
    	visitor.visit(this);
    }

    public void operation() {
    	//do some work
    }
}