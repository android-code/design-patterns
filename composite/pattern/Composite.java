public class Composite implements Component {

    private List<Component> childrens;
    //other fields

    public Composite() {
        childrens = new ArrayList();
    }

    public void addChild(Component component) {
        childrens.add(component);
    }

    public void removeChild(Component component) {
        childrens.remove(component);
    }

    @Override
    public void operation() {
        //do action
        for(Component children : childrens) {
            children.operation();
        }
    }

    //other methods
}