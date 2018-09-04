public abstract class Figure {

    private int color;
    private int borderColor;

    public Figure() {
        this.color = Color.WHITE;
        this.borderColor = Color.BLACK;
    }

    public Figure(int color, int borderColor) {
        this.color = color;
        this.borderColor = borderColor;
    }

    public Figure(Figure prototype) {
        this.color = prototype.color;
        this.borderColor = prototype.borderColor;
    }

    public abstract Prototype copy();
    public abstract void draw();
    public abstract double area();
    public abstract double perimeter();
}