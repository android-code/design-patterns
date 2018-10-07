interface Interactor {

    void getSavedLogin(); 
    void login(String login, String password);

    interface OnResult {

        void onLoginSuccess();
        void onLoginFail();
        void onSavedLoginExists(String savedLogin);
    }
}