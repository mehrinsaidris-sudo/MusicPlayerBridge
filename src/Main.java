import abstraction.*;
import concrete.*;
import implementor.AudioEngine;

public class Main {
    public static void main(String[] args){
        AudioEngine mp3 =
                new MP3Engine();
        AudioEngine spotify =
                new SpotifyEngine();
        MusicPlayer player1 =
                new BasicPlayer(mp3);
        player1.playSong(
                "Imagine.mp3"
        );

        MusicPlayer player2 =
                new PremiumPlayer(spotify);

        player2.playSong(
                "Shape of You"
        );

        player2.pauseSong();
        player2.stopSong();
    }
}