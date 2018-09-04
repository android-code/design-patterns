public class ConcreteFlyweight implements Flyweight {

    private String type;
    private int value;

    public ConcreteFlyweight(String type, int value) {
        //creation of object is consuming resources
        this.type = type;
        this.value = value;
    }

    @Override
    public void operation() {
        //do specific operation for ConcreteFlyweight
    }

    public void setValue(int value) {
        this.value = value;
    }

    //other setters and getters
}