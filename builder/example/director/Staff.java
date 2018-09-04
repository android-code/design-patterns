public class Staff {

    private Cook builder;

    public Staff(Cook builder) {
        this.builder = builder;
    }

    public Meal makeMeal() {
        builder.prepareBurger();
        builder.prepareBeverage();
        builder.prepareExtra();
        return builder.getMeal();
    }
}
