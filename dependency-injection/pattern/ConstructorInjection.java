public class ConstructorInjection {

    private Dependency1 dependency1;
    private Dependency2 dependency2;

    public ConstructorInjection(Dependency1 dependency1, Dependency2 dependency2) {
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }
}