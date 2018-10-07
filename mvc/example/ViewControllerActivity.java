public class ViewControllerActivity extends AppCompatActivity {

    private EditText startEdit;
    private EditText destinationEdit;
    private Button searchButton;

    private TrackModel model;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        model = new TrackModel(this);

        //in clear MVC inflating layout, listeners and views update
        //should be done in separeted View layer
        initView();
        setListeners();
        setViews();
    }

    //view layer
    private void initView() {
        setContentView(R.layout.viewcontroller_activity);
        startEdit = findViewById(R.id.startEdit);
        destinationEdit = findViewById(R.id.destinationEdit);
        searchButton = findViewById(R.id.searchButton);
    }

    //view layer set listener passed from controller
    private void setListeners() {
        searchButton.setOnClickListener(v -> { searchAction(); });
    }

    //view layer
    private void setViews() {
        String home = model.getHomePlace();
        startEdit.setText(home);
    }

    //controller layer runs this method on the view layer
    private void showError(String text) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }

    //controller layer
    private void searchAction() {
        //controller get inputs from view
        String login = startEdit.getText().toString();
        String destination = destinationEdit.getText().toString();
        String result = model.search(start, destination);
        if(result.equals("EMPTY")) {
            showError("Incorrect login or password");
            
        }
        else {
            //show search result in another activity/popup or in list
        }
    }

    //other lifecycle methods
}