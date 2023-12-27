package joshi.spacecats.main;

import java.util.Timer;
import java.util.TimerTask;

public class Difficulty {
	
	Timer difficulty = new Timer();
	
	private PlaySound sound = new PlaySound();
	
	public static boolean lvlup = false;

	public Difficulty() {
		
		sound.load();
		
		difficulty.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				if (Var.inGame) {

					sound.play(PlaySound.lvlup);
					
					Var.lvl++;
					
					lvlup = true;
					
					difficulty.schedule(new TimerTask() {
					
						@Override
						public void run() {
						
							lvlup = false;
						
						}
					}, 100);
				
					Var.rocketspeed[0] = Var.lvl + 5;
					Var.rocketspeed[1] = Var.lvl + 3;
					Var.rocketspeed[2] = Var.lvl + 4;
					Var.rocketspeed[3] = Var.lvl + 3;
					Var.rocketspeed[4] = Var.lvl + 4;
					Var.rocketspeed[5] = Var.lvl + 5;
					Var.rocketspeed[6] = Var.lvl + 3;
					Var.rocketspeed[7] = Var.lvl + 5;
					Var.rocketspeed[8] = Var.lvl + 4;
					Var.rocketspeed[9] = Var.lvl + 5;
				
				}
				
			}
		}, 30000, 30000);
		
	}

}
