public class Player {

    private State state;
    private List<Track> tracks;
    private int currentTrack;
    //other fields like system or music controllers

    public Player(List<Track> tracks){
        this.tracks = tracks;
        currentTrack = 0;
        currentTime = 0;
        state = new StopState();
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }

    public void play() {
        state.play(this);
    }

    public void next() {
        state.next(this);
    }

    public void previous() {
        state.previous(this);
    }

    public void playTrack() {
        //play the currentTrack
        //change UI button
    }

    public void stopTrack() {
        //stop the currentTrack
        //change UI button
    }

    public void nextTrack() {
        //stop the CurrentTrack
        if(currentTrack < tracks.size() - 1)
            currentTrack++;
        else
            currentTrack = 0;
        //play the currentTrack
        //change UI info
    }

    public void previousTrack() {
        if(currentTrack > 0)
            currentTrack = tracks.size() - 1;
        else
            currentTrack--;
        //play the currentTrack
        //change UI info
    }
}