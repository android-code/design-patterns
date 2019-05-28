public class ViewActivity extends AppCompatActivity implements View {

    private EditText loginEdit;
    private EditText passwordEdit;
    private Button loginButton;

    private Presenter presenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_activity);
        presenter = new PresenterImpl(this);

        initView();
        setListeners();
        setViews();
    }

    //other lifecycle methods

    private void initView() {
        loginEdit = findViewById(R.id.loginEdit);
        passwordEdit = findViewById(R.id.passwordEdit);
        loginButton = findViewById(R.id.loginButton);
    }

    private void setListeners() {
        loginButton.setOnClickListener(v -> { loginAction(); });
    }

    private void setViews() {
        presenter.initView();
    }

    @Override
    public void setLastLogin(String login) {
        loginEdit.setText(login);
    }

    @Override
    public void navigateToHome() {
        //go to another activity (like home screen)
        //instead of doing logic operations it can be delegate to Router helper class
    }

    @Override
    public void showError() {
        Toast.makeText(this, "Incorrect login or password", Toast.LENGTH_LONG).show();
    }

    @Override
    public void showInvalidLoginError(boolean enable) {
        if(enable) {
            //show invalid login error
        }
        else {
            //clear error
        }
    }

    @Override
    public void showInvalidPasswordError(boolean enable) {
        if(enable) {
            //show invalid password error
        }
        else {
            //clear error
        }
    }

    private void loginAction() {
        //controller get inputs from view
        String login = loginEdit.getText().toString();
        String password = passwordEdit.getText().toString();
        presenter.loginButtonClicked(login, password);
    }
}