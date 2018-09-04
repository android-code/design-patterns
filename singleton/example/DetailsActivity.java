public class DetailsActivity extends AppCompatActivity {

    private TextView name, age, isStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
        isStudent = findViewById(R.id.isStudent);

        initValues();
    }

    private void initValues() {
        name.setText(SharedPref.getInstance(this).readString(SharedPref.NAME_KEY));
        age.setText(String.valueOf(SharedPref.getInstance(this).readInt(SharedPref.AGE_KEY)));
        isStudent.setText(String.valueOf(SharedPref.getInstance(this).readBoolean(SharedPref.STUDENT_KEY)));
    }
}
