public class Triangle {

    private Point point1, point2, point3;

    public Triangle() {
        this(new Point(0, 0), new Point(0, 0), new Point(0, 0));
    }

    public Triangle(Point point1, Point point2, Point point3) {
        super();
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Triangle(Triangle prototype) {
        super(prototype);
        if(prototype != null) {
            this.point1 = new Point(prototype.point1.getX(), prototype.point1.getY());
            this.point2 = new Point(prototype.point2.getX(), prototype.point2.getY());
            this.radius = new Point(prototype.point3.getX(), prototype.point3.getY());
        }
    }

    @Override
    public Figure copy() {
        //deep copy
        return new Triangle(this);
    }

    @Override
    public void draw() {
        //draw Triangle on the board in own way
    }

    @Override
    public double area() {
        double p = perimeter() / 2;
        double a = getSideLength(point1, point2);
        double b = getSideLength(point1, point3);
        double c = getSideLength(point2, point3);
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public double perimeter() {
        double a = getSideLength(point1, point2);
        double b = getSideLength(point1, point3);
        double c = getSideLength(point2, point3);
        return a + b + c;
    }

    private double getSideLength(Point point1, Point point2) {
        double size = Math.pow(point1.getX() - point2.getX()) + Math.pow(point1.getY() - point2.getY());
        return Math.sqrt(size);
    }
}