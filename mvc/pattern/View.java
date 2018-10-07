public class View {

    //some view fields like buttons, textview etc
    private TextView textView;
    private EditText editText;
    private Button button;

    private Model model;

    //parent view object also can be passed here
    public View(Model model) {
        this.model = model;
        initView();
    }

    private void initView() {
        //init views (in Android like findViewById from passed parent view in constructor)
        //set default text/image etc in the views
    }

    public void showError(String error) {
        //show error on the screen (in Android like Toast)
    }

    public String getInput() {
        return editText.getText().toString();
    }

    public void updateText() {
        //update tasks list in TextView
        textView.setText(model.getData());
        //show response text in the textView
    }
}