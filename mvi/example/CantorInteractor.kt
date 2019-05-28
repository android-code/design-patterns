class CantorInteractor {

    //get data exchange rates from remote server, this is just mock implementation
    //return proper state depends on the fetch items

    fun fetchDataToday() : Observable<PartialCantorState> {
        val items = mutableListOf<ExchangeRate>()
        repeat(20) {
            Random.nextDouble(0.1, 100.0)
            items.add(ExchangeRate("Currency $it", random()))
        }
        return Observable.just(PartialCantorState.SuccessState(items))
    }

    fun fetchDataDay(date : Date) : Observable<PartialCantorState> {
        val items = mutableListOf<ExchangeRate>()
        repeat(20) {
            items.add(ExchangeRate("Currency $it", random()))
        }
        return Observable.just(PartialCantorState.SuccessState(items))
    }

    private fun random() : Double {
        return ((1..10000).random() / 100).toDouble()
    }
}