public class ViewControllerActivity extends AppCompatActivity {

    private EditText loginEdit;
    private EditText passwordEdit;
    private Button loginButton;

    private LoginModel model;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        model = new LoginModel(this);

        //in clear MVC inflating layout, listeners and views update
        //should be done in separeted View layer
        initView();
        setListeners();
        setViews();
    }

    //view layer
    private void initView() {
        setContentView(R.layout.viewcontroller_activity);
        loginEdit = findViewById(R.id.loginEdit);
        passwordEdit = findViewById(R.id.passwordEdit);
        loginButton = findViewById(R.id.loginButton);
    }

    //view layer set listener passed from controller
    private void setListeners() {
        loginButton.setOnClickListener(v -> { loginAction(); });
    }

    //view layer
    private void setViews() {
        String login = model.getLastLogin();
        loginEdit.setText(login);
    }

    //controller layer runs this method on the view layer
    private void showError(String text) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }

    //controller layer
    private void loginAction() {
        //controller get inputs from view
        String login = loginEdit.getText().toString();
        String password = passwordEdit.getText().toString();
        boolean success = model.login(login, password);
        if(success) {
            //go to another activity
        }
        else {
            showError("Incorrect login or password");
        }
    }

    //other lifecycle methods
}