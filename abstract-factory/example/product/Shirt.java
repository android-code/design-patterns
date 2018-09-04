public abstract class Shirt extend Clothes {

    private Color color;
    private Size size;
    private boolean longSleeve;

    public Shirt(Color color, Size size, boolean longSleeve) {
        this.color = color;
        this.size = size;
        this.longSleeve = longSleeve;
    }
}
