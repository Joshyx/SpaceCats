package joshi.spacecats.main;

import java.util.Timer;
import java.util.TimerTask;

public class Background {
	
	Timer back;
	
	public Background() {
		
		back = new Timer();
		back.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				if(Var.inGame) {
				if (Var.backgroundX1 > -1900) {
					Var.backgroundX1 -= 1;
				} else 
					Var.backgroundX1 = 1920;
				
				if (Var.backgroundX2 > -1900) {
					Var.backgroundX2 -= 1;
				} else 
					Var.backgroundX2 = 1920;
				}
			}
			
		}, 0, Var.backgroundspeed);
		
	}

}
