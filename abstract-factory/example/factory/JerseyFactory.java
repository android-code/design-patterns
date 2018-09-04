public abstract class JerseyFactory {

    public abstract Socks createSocks(Color color);
    public abstract Shorts createShorts(Size size, Color color);
    public abstract Shirt createShirt(Size size, Color color, boolean longSleeve);

    public Jersey createJersey(Size size, Color color, boolean longSleeve) {
        Socks socks = createSocks(color);
        Shorts shorts = createShorts(size, color);
        Shirt shirt = createShirt(size, color, longSleeve);
        return new Jersey(socks, shorts, shirt);
    }
}
