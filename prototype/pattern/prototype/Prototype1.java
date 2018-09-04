public class Prototype1 extends Prototype {

    private double price;
    //other primitive fields

    public Prototype1() {
        this(0);
    }

    public Prototype1(int price) {
        super();
        this.price = price;
    }

    public Prototype1(Prototype1 prototype) {
        super(prototype);
        if(prototype != null) {
            this.price = prototype.price;
            //do the same for all fields
        }
    }

    @Override
    public Prototype copy() {
        //shallow copy
        return new Prototype1(this);
    }

    @Override
    public void action() {
        //do specific action for Prototype1
    }

    //some other methods
}