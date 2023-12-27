package joshi.spacecats.main;

import java.util.Timer;
import java.util.TimerTask;

public class Loosed {
	
	Timer loose;
	private int temp = 0;

	public Loosed() {

		loose = new Timer();
		loose.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				if (Var.loosed) {
					if (temp >= 0 && temp <= 10) {
						temp++;
					} else if (temp >= 11) {
						
						//Deathscreen
						Var.inDeathScreen = true;
						
						KeyHandler.tempKeyHandler++;
						
						temp = 0;
						
						
						
					}
				}
				
			}
		}, 0, 15);
		
	}

}
