public class InterfaceInjection implements IInjection {

    private Dependency1 dependency1;
    private Dependency2 dependency2;

    @Override
    public void injectDependency1(Dependency1 dependency1) {
    	this.dependency1 = dependency1;
    }

    @Override
    public void injectDependency2(Dependency2 dependency2) {
    	this.dependency2 = dependency2;
    }
}