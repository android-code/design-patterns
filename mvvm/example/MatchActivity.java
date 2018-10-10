public class MatchActivity extends AppCompatActivity {

    private MatchViewModel viewModel;
    private ActivityMatchBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = ViewModelProviders.of(this).get(MatchViewModel.class); //auto restore
        initBinding();
        initObservers();
    }

    private void initBinding() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_match);
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);
    }

    private void initObservers() {
        viewModel.getIsProgress().observe(this, aBoolean -> {
            //show or hide progress
        });
        viewModel.getState().observe(this, state -> {
            //show some message based on status code or do something else
        });
    }
}