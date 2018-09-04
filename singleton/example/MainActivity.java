public class MainActivity extends AppCompatActivity {

    private Button clearPref, setPref, showDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clearPref = findViewById(R.id.clear_preferences);
        setPref = findViewById(R.id.default_preferences);
        showDetails = findViewById(R.id.show_details);

        clearPref.setOnClickListener(v -> clearPreferences());
        setPref.setOnClickListener(v -> setDefaultPreferences());
        showDetails.setOnClickListener(v -> showPreferences());
    }

    private void clearPreferences() {
        SharedPref.getInstance(getApplicationContext()).clearPreferences();
    }

    private void setDefaultPreferences() {
        SharedPref.getInstance(getApplicationContext()).writeString(SharedPref.NAME_KEY, "Maciej");
        SharedPref.getInstance(getApplicationContext()).writeInt(SharedPref.AGE_KEY, 26);
        SharedPref.getInstance(getApplicationContext()).writeBoolean(SharedPref.STUDENT_KEY, false);
    }

    private void showPreferences() {
        Intent intent = new Intent(this, DetailsActivity.class);
        startActivity(intent);
    }
}
