public class MatchViewModel extends ViewModel {

    private MutableLiveData<Integer> teamAScore = new MutableLiveData<>();
    private MutableLiveData<Integer> teamBScore = new MutableLiveData<>();
    private MutableLiveData<String> events = new MutableLiveData<>();
    private MutableLiveData<String> player = new MutableLiveData<>();
    private MutableLiveData<Boolean> isProgress = new MutableLiveData<>();
    private MutableLiveData<State> state = new MutableLiveData<>();

    private MatchModel model;

    public MyViewModel() {
        teamAScore.setValue(0);
        teamBScore.setValue(0);
        events.setValue("");
        player.setValue("");
        isProgress.setValue(false);
        state.setValue(NONE);
        model = new MatchModel();
    }

    public LiveData<Integer> getTeamAScore() {
        return teamAScore;
    }

    public LiveData<Integer> getTeamBScore() {
        return teamBScore;
    }

    //other get methods for all LiveData fields

    public void onButtonScoreAClicked(View view) {
        if(player.getValue.equals("")) {
            status.setValue(EMPTY_PLAYER);
        }
        else { 
            isProgress.setValue(true);
            teamAScore.setValue(teamScoreA.getValue() + 1);
            model.goal(player.getValue());
            events.setValue(model.getEvents()); //could be some model callback
            player.setValue("");
            isProgress.setValue(false);
            status.setValue(EVENT_ADDED);
        }
    }

    public void onButtonScoreBClicked(View view) {
        //do the same way as onButtonsScoreAClicked but for Team B
    }

    //other handler events method like on yellow, red card or injury
}