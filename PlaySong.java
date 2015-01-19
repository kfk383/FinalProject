import java.io.InputStream;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

public class PlaySong extends Thread {

    private final String resource;

    public static void play(String resource) {
        Thread t = new PlaySong(resource);
        t.setDaemon(true);
        t.start();
    }

    public PlaySong(String resource) {
        this.resource = resource;
    }

    public void run(){
        Clip clip = null;
        try {
            InputStream in = PlaySong.class.getClassLoader().getResourceAsStream(resource);
            if (in != null){
                AudioInputStream stream = AudioSystem.getAudioInputStream(in);
                AudioFormat format = stream.getFormat();
                DataLine.Info info = new DataLine.Info(Clip.class, format);
                clip = (Clip) AudioSystem.getLine(info);
                clip.open(stream);
                clip.loop(Clip.LOOP_CONTINUOUSLY);
                do{
                    try{
                        Thread.sleep(100);
                    }catch(InterruptedException e) {
                    }
                } while(clip.isRunning());
            }
        }catch (Exception e) {
            e.printStackTrace(System.out);
        }finally{
            try{
                if(clip != null) {
                    clip.close();
                }
            }catch(Exception e) {
                e.printStackTrace(System.out);
            }
        }
    }
}