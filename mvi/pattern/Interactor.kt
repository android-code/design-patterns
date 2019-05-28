//define some backend by Repository or Manager or Interactor class etc.
class Interactor {

    fun fetchResult() : Observable<PartialState> {
        //try to download some data and return proper partial state based on result
        return Observable.just(PartialState.SuccessState("some result")) //mock
    }
}