public class Main {

    public static void main() {
        //some case to use Implementator1
        Abstraction abstraction1 = new Abstraction1(new Implementor1());
        abstraction1.operation1(); //runs operation1 from Implementor1

        //some case to use Implementator2
        Abstraction abstraction2 = new Abstraction2(new Implementor2());
        abstraction2.operation2(); //runs operation2 from Implementor2
    }
}