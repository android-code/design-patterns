data class CantorState(
    val progress : Boolean = false,
    val error : Boolean = false,
    val progressList : Boolean = false,
    val errorList : Boolean = false,
    val items : List<ExchangeRate> = listOf()
)