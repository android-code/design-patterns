public class Prototype2 extends Prototype {

    private int value;
    private Complex complex; //has only int and boolean fields
    //other object and primitive types

    public Prototype2() {
        this(0, new Complex(0, false));
    }

    public Prototype2(int value, Complex complex) {
        super();
        this.value = value;
        this.complex = complex;
    }

    public Prototype2(Prototype2 prototype) {
        super(prototype);
        if(prototype != null) {
            this.value = prototype.value;
            //copy complex object by getting all primitive types or provide copy method/copy constructor
            this.complex = new Complex(prototype.complex.getNumber(), prototype.complex.getAvailability()); 
            //do the same for all fields
        }
    }

    @Override
    public Prototype copy() {
        //deep copy
        return new Prototype2(this);
    }

    @Override
    public void action() {
        //do specific action for Prototype2
    }

    //some other methods
}