public abstract class Cook {

    protected Meal meal;

    public Meal getMeal() {
        return meal;
    }

    public abstract void prepareBurger();
    public abstract void prepareBeverage();
    public abstract void prepareExtra();
}
