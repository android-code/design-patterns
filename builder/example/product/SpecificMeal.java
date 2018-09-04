public class SpecificMeal {

    private Burger burger;
    private Beverage beverage;
    private Extra extra;

    private SpecificMeal(Chef chef) {
        this.burger = chef.burger;
        this.beverage = chef.beverage;
        this.extra = chef.extra;
    }

    public static class Chef {

        private Burger burger;
        private Beverage beverage;
        private Extra extra;

        public Chef prepareBurger(Burger burger) {
            this.burger = burger;
            return this;
        }

        public Chef prepareBeverage(Beverage beverage) {
            this.beverage = beverage;
            return this;
        }

        public Chef prepareExtra(Extra extra) {
            this.extra = extra;
            return this;
        }

        public SpecificMeal makeMeal() {
            return new SpecificMeal(this);
        }
    }
}
