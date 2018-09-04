public abstract class Prototype {

    //some fields
    //some common methods

    public Prototype() {
        //initialize fields  
    }

    public Prototype(Prototype prototype) {
        //copy all fields from prototype into this instance
    } 

    //in Java clone is abstract method of Object class so no need copy extra method
    public abstract Prototype copy();
    public abstract void action();
}