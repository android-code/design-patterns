public enum Currency {

    PLN(1),
    USD(2),
    GBP(3),
    EUR(4);
    //more currencies

    private int currency;

    public Currency(int currency) {
        this.currency = currency;
    }
}