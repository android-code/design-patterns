public class Jersey {

    private Socks socks;
    private Shorts shorts;
    private Shirt shirt;

    public Jersey(Socks socks, Shorts shorts, Shirt shirt) {
        this.socks = socks;
        this.shorts = shorts;
        this.shirt = shirt;
    }

    public int getPrice() {
        return socks.getPrice() + shorts.getPrice() + shirt.getPrice();
    }

    public String getDescription() {
        return "Jersey: " + socks.getName() + " " + shorts.getName() + " " + shirt.getName();
    }

    public boolean isAvailable() {
        return socks.isAvailable() && shorts.isAvailable() && shirt.isAvailable();
    }
}
