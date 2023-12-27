package joshi.spacecats.main;

import java.util.Timer;
import java.util.TimerTask;

public class RocketMovement {
	
	Timer movement;
	private int temp = 0, temp2 = 0;
	
	public RocketMovement() {	
		
		for (int i = 0; i <= 9; i++) {
			Var.rocketY[i] = 15 + temp;
			Var.rocketX[i] = 2020 + temp2;
			
			temp += 105;
			temp2 += 220;
		}
		
		movement = new Timer();
		movement.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				if(Var.inGame) {
				for (int i = 0; i <= 9; i++) {
					
					Var.rocketX[i] -= Var.rocketspeed[i];
					if (Var.rocketX[i] <= -200) {
						Var.rocketX[i] = 2020;
					}
					
					Var.pewdsX -= 1;
					if (Var.pewdsX <= -700) {
						Var.pewdsX = 80000;
					}
					
				}
				}
			}
		}, 0, 9);
		
	}
}
