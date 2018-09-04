public abstract class AbstractClass {

    public void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        primitiveOperation3();
    }

    protected abstract void primitiveOperation2();

    private void primitiveOperation1() {
        //do something always
    }

    protected void primitiveOperation3() {
        //do something optional
    }

    //some others operations
}