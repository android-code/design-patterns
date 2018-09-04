public class StopState implements State {

    //do some things in every methods and run player's method or modify player if needed

    @Override
    public void play(Player player) {
        player.playTrack();
        player.setState(new PlayState());
    }

    @Override
    public void next(Player player) {
        player.nextTrack();
    }

    @Override
    public void previous(Player player) {
        player.previousTrack();
    }
}