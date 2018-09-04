public class HardwarePlayer {

    //variables

    public HardwarePlayer(Source source) {
        //implementation;
    }

    public void load(SongBytes songBytes) {
        //implementation
    }

    public void play() {
        //implementation
    }

    public void start() {
        //implementation
    }

    public void pause() {
        //implementation
    }

    public void stop() {
        //implementation;
    }

    public void setVolume(int volume) {
        //implementation
    }

    public enum Source {
        INTERNAL(0),
        EXTERNAL(1);

        int source;
        Source(int source) {
            this.source = source;
        }
    }

    //other methods

}
