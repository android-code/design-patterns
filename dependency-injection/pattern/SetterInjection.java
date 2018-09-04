public class SetterInjection {

    private Dependency1 dependency1;
    private Dependency2 dependency2;

    public void setDependency1(Dependency1 dependency1) {
        this.dependency1 = dependency1;
    }

    public void setDependency2(Dependency2 dependency2) {
    	this.dependency2 = dependency2;
    }
}