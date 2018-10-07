interface Contract {

    interface View {

        void navigateToHome();
        void showError();
        void showInvalidLogin(boolean valid);
        void showInvalidPassword(boolean valid);
    }

    interface Presenter {

        void initView();
        void loginButtonClicked(String login, String password);
    }
}