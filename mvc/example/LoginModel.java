public class LoginModel {

    //some network provider
    private SharedPreferences sharedPref;
    private SharedPreferences.Editor editor;
    private Context context;

    public LoginModel(Context context) {
        this.context = context;
        sharedPref = context.getPreferences(Context.MODE_PRIVATE);
    }

    //could be some response code instead of boolean
    public boolean login(String login, String password) {
        //use some network library to login

        //if response is ok
        saveLogin(login);
        return true; //mock

        //if response fail just return false
    }

    public String getLastLogin() {
        return sharedPref.getString("login", "");
    }

    public void saveLogin(String login) {
        editor = sharedPref.edit();
        editor.putString("login", login);
        editor.commit();
    }
}