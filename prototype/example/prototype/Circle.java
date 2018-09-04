public class Circle extends Figure {

    private int x, y, radius;

    public Circle() {
        this(0, 0, 0);
    }

    public Circle(int x, int y, int radius) {
        super();
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(Circle prototype) {
        super(prototype);
        if(prototype != null) {
            this.x = prototype.x;
            this.y = prototype.y;
            this.radius = prototype.radius;
        }
    }

    @Override
    public Figure copy() {
        //shallow copy
        return new Circle(this);
    }

    @Override
    public void draw() {
        //draw Circle on the board in own way
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius);
    }

    @Override
    public double perimeter() {
        return 4 * Math.PI * radius;
    }
}