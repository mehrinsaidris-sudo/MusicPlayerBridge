package concrete;
import implementor.AudioEngine;
public class MP3Engine implements AudioEngine {

    @Override
    public void play(String song){
        System.out.println(
                "Playing MP3 file: " + song
        );
    }

    @Override
    public void pause(){
        System.out.println(
                "MP3 paused"
        );
    }

    @Override
    public void stop(){
        System.out.println(
                "MP3 stopped"
        );
    }
}