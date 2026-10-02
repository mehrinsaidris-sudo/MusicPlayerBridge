package concrete;
import implementor.AudioEngine;
public class SpotifyEngine implements AudioEngine {

    @Override
    public void play(String song){
        System.out.println(
                "Streaming from Spotify: " + song
        );
    }

    @Override
    public void pause(){
        System.out.println(
                "Spotify paused"
        );
    }

    @Override
    public void stop(){
        System.out.println(
                "Spotify stopped"
        );
    }
}