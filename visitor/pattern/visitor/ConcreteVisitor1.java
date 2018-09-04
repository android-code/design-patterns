public class ConcreteVisitor1 {

    @Override
    public void visit(Element1 element) {
        //do something specific for ConcreteVisitor1
        element.operation();
    }

    @Override
    public void visit(Element2 element) {
        //do something specific for ConcreteVisitor1
        element.action();
    }

    @Override
    public void visit(Element3 element) {
        //do something specific for ConcreteVisitor1
        element.work();
    }
}