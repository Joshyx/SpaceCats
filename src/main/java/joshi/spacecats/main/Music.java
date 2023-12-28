package joshi.spacecats.main;

import javax.sound.sampled.Clip;
import java.util.Timer;
import java.util.TimerTask;

public class Music {

    PlaySound sound = new PlaySound();

    static Clip clip;
    Timer timer = new Timer();

    public Music() {

        timer.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                sound.play(PlaySound.music);
            }
        }, 5000, 198000);
    }
}
