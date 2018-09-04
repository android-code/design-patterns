public class BasketballFactory extend JerseyFactory {

    @Override
    public Socks createSocks(Color color) {
        return new BasketballSocks(color);
    }

    @Override
    public Shorts createShorts(Size size, Color color) {
        return new BasketballShorts(size, color);
    }

    @Override
    public Shirt createShirt(Size size, Color color, boolean longSleeve) {
        return new BasketballShirt(size, color, false);
    }
}
