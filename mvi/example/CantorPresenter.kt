class CantorPresenter(private val interactor : CantorInteractor) {

    //for proper init and unit stream
    private val compositeDisposable = CompositeDisposable()

    //downgrade date by one day for every load more in real app
    private var date = Date(System.currentTimeMillis())

    fun bind(view : CantorView) {
        //create and set all intents from view
        val loadToday = view.loadTodayIntent()
            .flatMap { interactor.fetchDataToday()
                .startWith(PartialCantorState.ProgressState)
                .onErrorReturn { PartialCantorState.ErrorState }
            }

        val loadMore = view.loadMoreIntent()
            .flatMap { interactor.fetchDataDay(date)
                .startWith(PartialCantorState.ProgressMoreState)
                .onErrorReturn { PartialCantorState.ErrorMoreState }
            }

        //merge them for proper UI and states manage
        val allIntents = Observable.merge(listOf(loadToday, loadMore))

        compositeDisposable.add(
            //use state reducer by scan operator to merge current and previous state
            allIntents.scan(CantorState(), this::reduce).subscribe { view.render(it) }
        )
    }

    fun unbind() {
        compositeDisposable.clear()
    }

    private fun reduce(previous : CantorState, changes : PartialCantorState) : CantorState {
        //for some states there could be need previous state data model
        return when(changes) {
            PartialCantorState.ProgressState -> CantorState(progress = true)
            PartialCantorState.ErrorState -> CantorState(error = true)
            PartialCantorState.ProgressMoreState -> CantorState(progressList = true, items = previous.items) //save the data
            PartialCantorState.ErrorMoreState -> CantorState(errorList = true, items = previous.items) //save the data
            is PartialCantorState.SuccessState -> {
                //add data to previous model instead of init only by changes
                val data = mutableListOf<ExchangeRate>()
                data.addAll(previous.items)
                data.addAll(changes.result)
                CantorState(items = data)
            }
        }
    }
}