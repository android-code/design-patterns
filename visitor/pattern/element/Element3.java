public class Element3 implements Element {
	
    @Override
    public void accept(Visitor visitor) {
    	visitor.visit(this);
    }

    public void work() {
    	//do some work
    }
}