package joshi.spacecats.main;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

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
		click = new File("rsc/click.wav");
		stop = new File("rsc/stop.wav");
		start = new File("rsc/start.wav");
		coin = new File("rsc/coin.wav");
		hurt = new File("rsc/hurt.wav");
		lvlup = new File("rsc/lvlup.wav");
		music = new File("rsc/background_music.wav");
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
