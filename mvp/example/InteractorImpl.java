public class InteractorImpl implements Interactor {

    //some network provider
    private SharedPreferences sharedPref;
    private SharedPreferences.Editor editor;
    private Context context;

    private OnResult listener;

    public InteractorImpl(OnResult listener) {
        this.listener = listener;
        this.context = App.getContext();
        sharedPref = context.getPreferences(Context.MODE_PRIVATE);
    }

    @Override
    public void login(String login, String password) {
        //use some network library to login
        int code = Response.OK; //mock code response from network

        if(code == Response.OK) {
            saveLogin(login);
            listener.onLoginSuccess();
        }
        else {
            listener.onLoginFail();
        }
    }

    @Override
    public void getSavedLogin() {
        String savedLogin = sharedPref.getString("login", "");
        if(!savedLogin.equals(""))
            listener.onSavedLoginExists(savedLogin);
    }

    private void saveLogin(String login) {
        editor = sharedPref.edit();
        editor.putString("login", login);
        editor.commit();
    }
}