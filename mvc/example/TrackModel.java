public class TrackModel {

    //some network provider
    private SharedPreferences sharedPref;
    private SharedPreferences.Editor editor;
    private Context context;

    public TrackModel(Context context) {
        this.context = context;
        sharedPref = context.getPreferences(Context.MODE_PRIVATE);
    }

    //could be some response message instead of String result
    public String search(String start, String destination) {
        //use some network library to login

        //if response is ok
        saveHome(start);
        return "14:00 " + start " - " + destination + " 15:30";
        return true; //mock

        //if response fail just return "EMPTY"
    }

    public String getHomePlace() {
        return sharedPref.getString("home", "");
    }

    public void saveHome(String start) {
        editor = sharedPref.edit();
        editor.putString("home", start);
        editor.commit();
    }
}