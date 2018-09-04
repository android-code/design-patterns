public class Main {

	public static void main() {
		//check the user choice and set proper RouteFinder
		RouteFinder routeFinder = new CarRoute();

		//get coordinates of choosen start and destination points
		Coordinates start = new Coordinates(52.409538, 16.931993); //Poznań
		Coordinates destination = new Coordinates(52.237049, 21.017532); //Warsaw

		//find route
		//show progress
		boolean success = routeFinder.find(start, destination);
		//hide progress
		if(success) {
		    Route route = routeFinder.getRoute();
		    //show route on map with tips
		}
		else {
		    //show proper message
		}
	}
}