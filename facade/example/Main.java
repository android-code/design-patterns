public class Main {

    private MediaPlayer mediaPlayer;

    public static void main() {
        mediaPlayer = new MediaPlayer(HardwarePlayer.Source.INTERNAL, true);
    }

    private void volumeDownClick() {
        mediaPlayer.decreaseVolume();
    }

    private void volumeUpClick() {
        mediaPlayer.increaseVolume();
    }

    private void nextSongClick() {
        mediaPlayer.nextSong();
    }

    private void previousSongClick() {
        mediaPlayer.previousSong();
    }

    private void stopClick() {
        mediaPlayer.stop();
    }

    private void playClick() {
        if(mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
            //change image for play
        }
        else {
            mediaPlayer.play();
            //change image for pause
        }
    }
}
