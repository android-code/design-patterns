public class MainActivity extends AppCompatActivity {

	private ListView listView;
	private ItemAdapter adapter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.main_activity);

	    List<Item> items = getData();
		//insert adapter with ViewHolder into ListView
		listView = findViewById(R.id.listView);
		adapter = new ItemAdapter(items);
		listView.setAdapter(adapter);
	}

	//get data from somewhere like server response
	private List<Item> getData() {
		List<Item> items = new ArrayList<>();
		items.add(new Item("Item1", R.drawable.image1));
		items.add(new Item("Item2", R.drawable.image2));
		items.add(new Item("Item3", R.drawable.image3));
		//more and more items
		return items;
	}

	//other lifecycle methods
}