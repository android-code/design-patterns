//to simplify MVI idea the View is implemented by some class, in Android it should be e.g. Activity
class ViewImpl : View {

    private val presenter = Presenter(Interactor())
	
	public ViewImpl() {
        presenter.bindIntents(this)
		
        //init views

        emitActionIntent() //emit action on start
	}

    override fun emitActionIntent() : Observable<Boolean> {
        return Observable.just(true)
    }

    //render received model and react for changes i
    override fun render(state : Model) {
        with(state) {
            showProgress(progress)
            showError(error)
            showResult(result)
        }
    }

    private fun showProgress(enable : Boolean) {
        //show or hide progress bar
    }

    private fun showError(enable : Boolean) {
        //show or hide some error
    }

    private fun showResult(result : String) {
        //show some result
    }
}