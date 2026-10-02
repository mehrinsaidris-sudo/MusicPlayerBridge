package abstraction;
import implementor.AudioEngine;
public abstract class MusicPlayer {

    protected AudioEngine engine;
    public MusicPlayer(AudioEngine engine){
        this.engine = engine;

    }

    public abstract void playSong(String song);
    public abstract void pauseSong();
    public abstract void stopSong();

}