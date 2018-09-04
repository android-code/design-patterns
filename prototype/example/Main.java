public class Main {
	
	public static void main() {

		//new empty board initialize
		List<Figure> figures = new ArrayList();

		//user creates some figures
		Circle prototypeCircle = new Circle(10, 5, 4);
		prototypeCircle.draw();
		figures.add(prototypeCircle);

		Triangle prototypeTriangle = new Triangle(new Point(1, 1), new Point(1, 5), new Point(5, 1));
		prototypeTriangle.draw();
		figures.add(prototypeTriangle);

		//after creation basic giures, user just copy them instead of creat new ones from the beginning
		//some of them are modifed
		Circle copy1 = prototypeCircle.copy();
		copy1.setColor(Color.BLUE);
		copy.setRadius(2);
		figures.add(copy1);

		Triangle copy2 = prototypeTriangle.copy();
		copy2.setColor(Color.GREEN);
		triangle.setPoint1(new Point(5, 5));
		figures.add(copy2);

		//user calculates themself area and perimeter of the figures and check them with real results
		//calculate area and delimeter for all figures on the board
		for(Figure figure : figures) {
		    double area = figures.area();
		    double perimeter = figures.perimeter();
		    //check the answer
		}
	}
}