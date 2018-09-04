public class Meal {

    private Burger burger;
    private Beverage beverage;
    private Extra extra;

    public void addBurger(Burger burger) {
        this.burger = burger;
    }

    public void addBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    public void addExtra(Extra extra) {
        this.extra = extra;
    }
}
