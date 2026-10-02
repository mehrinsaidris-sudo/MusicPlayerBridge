package abstraction;
import implementor.AudioEngine;
public class PremiumPlayer extends MusicPlayer {

    public PremiumPlayer(AudioEngine engine){
        super(engine);
    }

    public void playSong(String song){
        System.out.println(
                "Premium quality enabled"
        );
        engine.play(song);
    }

    public void pauseSong(){
        engine.pause();
    }

    public void stopSong(){
        engine.stop();
    }
}
