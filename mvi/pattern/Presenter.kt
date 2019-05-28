class Presenter(private val interactor : Interactor) {

    fun bindIntents(view : View) {
        //bindIntents to observer Intents from View
        val actionObservable = view.emitActionIntent()
            .flatMap { interactor.fetchResult() }
            .startWith(PartialState.ProgressState)

        //subscribe to backend response
        actionObservable.subscribe {
            view.render(reduce(it))
        }
    }

    //remember to proper manage lifecycle and memory leaks and unbind observers and destroy observable

    //map received partial State to Model
    private fun reduce(partialState : PartialState) : Model {
        return when(partialState) {
            PartialState.ProgressState -> Model(progress = true)
            PartialState.ErrorState -> Model(error = true)
            is PartialState.SuccessState -> Model(result = partialState.result)
        }
    }
}