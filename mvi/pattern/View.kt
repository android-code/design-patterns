interface View {

    //the main responsibility is to react for received state in single method
    fun render(state : Model)

    //declare methods for emitting Intents like click on the button
    fun emitActionIntent() : Observable<Boolean> //observable of RxJava
}