public class PlayState implements State {

    //do some things in every methods and run player's method or modify player if needed

    @Override
    public void play(Player player) {
        player.stopTrack();
        player.setState(new StopState());
    }

    @Override
    public void next(Player player) {
        player.nextTrack();
    }

    @Override
    public void previous(Player player) {
        player.playTrack();
    }
}