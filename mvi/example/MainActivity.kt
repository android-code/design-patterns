class MainActivity : AppCompatActivity(), CantorView {

    private val presenter = CantorPresenter(CantorInteractor())
    private val itemAdapter = ExchangeRatesAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.apply {
            adapter = itemAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }

        presenter.bind(this)
    }

    //avoid it, this could makes memory leak, provide saving last state in presenter
    override fun onDestroy() {
        presenter.unbind()
        super.onDestroy()
    }

    override fun loadTodayIntent(): Observable<Boolean> {
        return Observable.just(true)
    }

    override fun loadMoreIntent(): Observable<Boolean> {
        //use RxBinding
        return recyclerView.scrollStateChanges()
            .filter { isBottomScroll() }
            .map { true }
    }

    override fun render(state : CantorState) {
        with(state) {
            showProgress(progress)
            showError(error)
            showProgressMore(progressList)
            showErrorMore(errorList)
            showResult(items)
        }
    }

    private fun showProgress(enable : Boolean) {
        //show or hide main progress bar
    }

    private fun showError(enable : Boolean) {
        //show or hide some main error container
    }

    private fun showProgressMore(enable : Boolean) {
        //show or hide progress bar on the bottom of the list
    }

    private fun showErrorMore(enable : Boolean) {
        //show or hide some error about load more
    }

    private fun showResult(newItems : List<ExchangeRate>) {
        itemAdapter.addItems(newItems)
    }

    private fun isBottomScroll() : Boolean {
        //detect somehow is the bottom of the list to load more items
        val linearLayoutManager = recyclerView.layoutManager as LinearLayoutManager
        return linearLayoutManager.findLastCompletelyVisibleItemPosition() == itemAdapter.itemCount - 1
    }
}