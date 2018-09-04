public class Main {

	public static void main() {
		Dependency1 dependency1 = new Dependency1("A");
		Dependency2 dependency2 = new Dependency2(10);
		ConstructorInjection constructorInjection = new ConstructorInjection(dependency1, dependency2);

		SetterInjection setterInjection = new SetterInjection();
		setterInjection.setDependency1(new Dependency1(20), new Dependency2("B"));

		InterfaceInjection interfaceInjection = new InterfaceInjection();
		interfaceInjection.injectDependency1(new Dependency1(30), new Dependency2("C"))
	}
}