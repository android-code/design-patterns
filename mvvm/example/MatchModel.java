public class MatchModel {

    private Database database;
    //other variables, logic managers or data providers like database, cache, network

    public MatchModel() {
        //do init staff
        //initialize some instances
        database = new Database();
    }

    public void goal(String player) {
        database.add("GOAL", player);
    }

    //other methods like yellow, red card or injury

    public String getEvents() {
        return database.getAllEvents(); //some string summary from all event
    }
}