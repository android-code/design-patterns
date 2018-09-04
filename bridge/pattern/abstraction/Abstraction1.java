public class Abstraction1 implements Abstraction {
	
    private Implementator implementator;
    //other fields

    public Abstraction1(Implementator implementator) {
        this.implementator = implementator;
    }

    @Override
    public void operation1() {
        implementator.operation1();
    }

    @Override
    public void operation2() {
        implementator.operation2();
    }

    @Override
    public void operation3() {
        //do some work
    }
}