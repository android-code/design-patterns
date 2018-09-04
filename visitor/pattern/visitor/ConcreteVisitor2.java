public class ConcreteVisitor2 {

    @Override
    public void visit(Element1 element) {
        element.operation();
        //do something specific for ConcreteVisitor2
    }

    @Override
    public void visit(Element2 element) {
        element.action();
        //do something specific for ConcreteVisitor2
    }

    @Override
    public void visit(Element3 element) {
        element.work();
        //do something specific for ConcreteVisitor2
    }
}