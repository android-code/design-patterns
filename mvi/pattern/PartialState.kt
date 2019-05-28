//decompose Model's fields into parts which represent single State
//Kotlin sealead class is great for this
sealed class PartialState {

    object ProgressState : PartialState()
    object ErrorState : PartialState()
    class SuccessState(val result : String) : PartialState()
}