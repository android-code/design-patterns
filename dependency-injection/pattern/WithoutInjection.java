public class WithoutInjection {

    private Dependency1 dependency1;
    private Dependency2 dependency2;

    public WithoutInjection() {
    	this.dependency1 = new Dependency1(10);
    	this.dependency2 = new Dependency2("A");
    }
}