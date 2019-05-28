//define Model where fields values describe the states of the screen
//e.g. screen can be in progress loading data, showing error or the final result
data class Model(
    val progress : Boolean = false,
    val error : Boolean = false,
    val result : String = ""
)