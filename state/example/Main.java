public class Main {
	
	public static vodi main() {
		//user create playlist
		List<Track> playlist = new ArrayList<>();
		playlist.add(new Track("Depeche Mode", "Enjoy the silence", 250, "dm01.mp3"));
		playlist.add(new Track("Abba", "Dancing Queen", 195, "abba07.mp3"));
		playlist.add(new Track("Ben Howard", "Keep your head up", 217, "bh04.mp3"));
		playlist.add(new Track("Of Monsters and Men", "Yellow Light", 184, "omm12.mp3"));

		//user choose playlist to play right now
		Player player = new Player(playlist);

		//player is initialized and ready to play the first song
		player.play(); //Enjoy the silence is playing (StopState)
		player.next(); //Dancing Queen is playing (PlayState)
		player.stop(); //Dancig Queen is pausing (StopState)
		player.previous(); //Enjoy the sielence is loaded again (StopState)
		player.play(); //Enjoy the silence is playing (PlayState)
		player.previous(); //Enojy the sielence is playing from the beginning (PlayState)
	}
}