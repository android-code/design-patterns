interface CantorView {

    fun render(state : CantorState)

    fun loadTodayIntent() : Observable<Boolean>
    fun loadMoreIntent() : Observable<Boolean>
}