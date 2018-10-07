public class Model {

    private Database database;
    //other variables, logic managers or data providers like database, cache, network

    public Model() {
        //do init staff
        //initialize some instances
        database = new Database();
    }

    public String getDescription(String input) {
        String result = database.get("WORD", input);
        if(result.equals(""))
          return "EMPTY";
        else
          return result;
    }
}