public class PresenterImpl implements Presenter, OnResult {

    private View view;
    private Interactor interactor;

    public PresenterImpl(View view) {
        this.view = view;
        this.interactor = new InteractorImpl(this); //can be injected by the View
    }

    @Override
    public void loginButtonClicked(String login, String password) {
        //validate login and password based on rules
        if(isLoginValid(login)) {
            view.showInvalidLoginError(false);
            
            if(isPasswordValid(password)) {
                view.showInvalidPasswordError(false);
                interactor.login(login, password);
            }
            else
                view.showInvalidPasswordError(true);
        }
        else
            view.showValidLoginError(true);
    }

    @Override
    public void initView() {
        interactor.getSavedLogin();
    }

    @Override
    public void onLoginSuccess() {
        view.navigateToHome();
    }
    
    @Override
    public void onLoginFail() {
        view.showError();
    }
        
    @Override
    public void onSavedLoginExists(String savedLogin) {
        view.setLastLogin(savedLogin);
    }

    private boolean isLoginValid(String login) {
        //check rules e.g. no special characters
        return true; //mock
    }

    private boolean isPasswordValid(String password) {
        //check rules e.g. length
        return true; //mock
    }
}