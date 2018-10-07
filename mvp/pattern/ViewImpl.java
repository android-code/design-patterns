public class ViewImpl implements View {
    //this class is in charge and initialize everything so in Android it could be Activity  
    //for simplify MVP idea any Android class is used

    //some view fields like buttons, textview etc
    private TextView textView;
    private EditText editText;
    private Button button;

    private PresenterImpl presenter;

    //for Activity, Fragment, Custom view or other View layer
    //initialize view and presenter in lifecycle methods
    public ViewImpl() {
        initView();
        initPresenter();
        initListeners();
    }

    private void initView() {
        //set default text/image etc in the views
    }

    private void initListeners() {
        button.setOnClickListener(v -> {
            String input = editText.getText().toString();
            presenter.onButtonClicked(input)
        });
    }

    private void initPresenter() {
        //in some variants Model object layer could be injected to presenter also
        this.presenter = new PresenterImpl(this);    
    }

    @Override
    public void updateText(String text) {
        textView.setText(text);
        //show response text in the textView
    }

    @Override
    public void showError(String error) {
        //show error on the screen (in Android like Toast)
    }

    @Override
    public void showProgress(boolean enable) {
        if(enable) {
            //show progress bar
        }
        else {
            //hide progress bar
        }      
    }
}