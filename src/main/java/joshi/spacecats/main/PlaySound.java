package joshi.spacecats.main;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class PlaySound {

    public static File click;
    public static File stop;
    public static File start;
    public static File coin;
    public static File hurt;
    public static File lvlup;
    public static File music;
    Clip clip;

    public void load() {
        click = new File("src/main/resources/click.wav");
        stop = new File("src/main/resources/stop.wav");
        start = new File("src/main/resources/start.wav");
        coin = new File("src/main/resources/coin.wav");
        hurt = new File("src/main/resources/hurt.wav");
        lvlup = new File("src/main/resources/lvlup.wav");
        music = new File("src/main/resources/background_music.wav");
    }

    public void play(File sound) {

        try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(sound));

            if (sound == music) {
                clip.loop(clip.LOOP_CONTINUOUSLY);
            } else {
                clip.start();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
