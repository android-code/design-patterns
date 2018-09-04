public class FootballFactory extend JerseyFactory {

    @Override
    public Socks createSocks(Color color) {
        return new FootballSocks(color);
    }

    @Override
    public Shorts createShorts(Size size, Color color) {
        return new FootballShorts(size, color);
    }

    @Override
    public Shirt createShirt(Size size, Color color, boolean longSleeve) {
        return new FootballShirt(size, color, longSleeve);
    }
}
