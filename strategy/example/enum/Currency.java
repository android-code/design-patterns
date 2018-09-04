public enum Currency {

    EUR(1),
    USD(2);
    //other currencies

    private int currency;

    public Currency(int currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        switch(currency) {
            case 1:
                return "EUR";
            case 2:
                return "USD";
            default:
                return "UNKNOWN";
        }
    }
}