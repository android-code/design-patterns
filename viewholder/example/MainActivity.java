public class MainActivity extends AppCompatActivity {

	private RecyclerView recyclerView;
	private FoodAdapter adapter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.main_activity);

	    //user chose restaurant and goes to dishes selection screen
		//app receives data from server for choosen restaurant and load into items collection
		List<Food> items = getData();

		//inflate layout and other lifecycle stuff
		recyclerView = findViewById(R.id.recyclerView);

		//insert adapter into recyclerView
		LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
		recyclerView.setLayoutManager(layoutManager);
		adapter = new FoodAdapter(getActivity(), items);
		recyclerView.setAdapter(adapter);
		//scrolling the list is smooth and faster now
	}

	//get data from somewhere like server response
	private List<Food> getData() {
		List<Food> items = new ArrayList<>();
		items.add("Pizza Margherita", 15.00, "http://example.com/margherita.jpg");
		items.add("Pizza Pepperoni", 18.00, "http://example.com/pepperoni.jpg");
		items.add("Pizza Hawaii", 20.00, "http://example.com/hawaii.jpg");
		//more and more items
		return items;
	}

	//other lifecycle methods
}