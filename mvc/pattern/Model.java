public class Model {

    private Database database;
    //other variables, logic managers or data providers like database, cache, network

    public Model() {
        //do init staff
        //initialize some instances
        database = new Database();
    }

    public boolean addData(String input) {
        boolean isSuccess = database.add("TASK", input);
        return success;
    }

    public String getData() {
        String tasks = "";
        for(int i=0; i<database.size("TASK"); i++)
            tasks += database.get("TASK", i) + "\n";
        return tasks;
    }
}