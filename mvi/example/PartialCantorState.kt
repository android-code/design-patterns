sealed class PartialCantorState {

    object ProgressState : PartialCantorState()
    object ErrorState : PartialCantorState()
    object ProgressMoreState : PartialCantorState()
    object ErrorMoreState : PartialCantorState()
    class SuccessState(val result : List<ExchangeRate>) : PartialCantorState()
}