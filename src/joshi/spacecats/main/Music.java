package joshi.spacecats.main;

import java.util.Timer;
import java.util.TimerTask;

import javax.sound.sampled.Clip;

public class Music {
	
	PlaySound sound = new PlaySound();
	
	static Clip clip;
	Timer timer = new Timer();

	public Music() {
		
		timer.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				sound.play( PlaySound.music );
			}
		}, 5000, 198000);
		
	}
	
	
}
