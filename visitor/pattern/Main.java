public class Main {

    public static void main() {
        //create some elements
        List<Element> elements = new ArrayList();
        elements.add(new Element1());
        elements.add(new Element2());
        elements.add(new Element3());

        //choose visitor
        Visitor visitor = new ConcreteVisitor1();
        for(Element element : elements)
            element.accept(visitor); //do specific job for ConcreteVisitor1

        //change visitor type
        visitor = new ConcreteVisitor2();
        for(Element element : elements)
            element.accept(visitor); //do specific job for ConcreteVisitor2
    }
}