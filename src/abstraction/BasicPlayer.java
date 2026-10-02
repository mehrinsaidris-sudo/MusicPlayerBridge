package abstraction;
import implementor.AudioEngine;
public class BasicPlayer extends MusicPlayer {

    public BasicPlayer(AudioEngine engine){
        super(engine);
    }

    public void playSong(String song){
        engine.play(song);
    }

    public void pauseSong(){
        engine.pause();
    }

    public void stopSong(){
        engine.stop();
    }
}