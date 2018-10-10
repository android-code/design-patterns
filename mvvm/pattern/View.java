public class View {
    //this class initialize everything so in Android it could be Activity  
    //for simplify MVVM idea any Android class is used

    //some view fields like buttons, textview etc
    private TextView textView;
    private EditText editText;
    private Button button;

    private ViewModel viewModel;

    public View() {
        initViewModel();
        initView();
    }

    private void initViewModel() {
        this.viewModel = new ViewModel();
        //observe viewModel state and prepare on changed listeners
    }

    private void initView() {
        //init views and set default text/images
        //this can be done in layout by data binding
    }
}