public class MediaPlayer {

    private FileManager fileManager;
    private HardwarePlayer hardwarePlayer;
    private SongFile songFile;
    private List<SongFile> songs;
    private int currentSong;
    private int currentVolume;
    private boolean isPlaying;

    public MediaPlayer(Source hardwareSource, boolean isSdCard) {
        fileManager = new FileManager(isSdCard);
        hardwarePlayer = new HardwarePlayer(hardwareSource);
        songs = new ArrayList<>();
        currentSong = 0;
        currentVolume = 5;
        isPlaying = false;
        createPlaylist();
    }

    public void play() {
        loadSong();
        hardwarePlayer.play();
        isPlaying = true;
    }

    public void pause() {
        hardwarePlayer.pause();
        isPlaying = false;
    }

    public void stop() {
        hardwarePlayer.stop();
        currentSong = 0;
        isPlaying = false;
    }

    public void increaseVolume() {
        if(currentVolume < 10)
            currentVolume++;
        changeVolume();
    }

    public void decreaseVolume() {
        if(currentVolume > 0)
            currentVolume--;
        changeVolume();
    }

    public void nextSong() {
        if(currentSong == songs.size() + 1)
            currentSong = 0;
        else
            currentSong++;
        changeSong();
    }

    public void previousSong() {
        if(currentSong == 0)
            currentSong = songs.size() - 1;
        else
            currentSong--;
        changeSong();
    }

    public void loadSong() {
        SongBytes songBytes = Converter.convertToBytes(songFile);
        hardwarePlayer.load(songBytes);
    }

    public void createPlaylist() {
        List<File> files = fileManager.readSongsList();
        songs = Converter.convertToSongFiles(files);
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    private void changeVolume() {
        hardwarePlayer.pause();
        hardwarePlayer.setVolume(currentVolume);
        hardwarePlayer.start();
    }

    private void changeSong() {
        songFile = songs.get(currentSong);
        hardwarePlayer.stop();
        play();
    }

    //other methods
}
