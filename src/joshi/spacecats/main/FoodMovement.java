package joshi.spacecats.main;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class FoodMovement {

	Timer movement;
	private int temp = 0;
	
	public FoodMovement() {
		
		for (int i = 0; i <= 4; i++) {
			Var.mouseY[i] = 20 + temp;
			Var.mouseX[i] = 2020 + temp;
			
			temp += 160;
		}
		
		Var.ratY[0] = 330;
		Var.ratY[1] = 660;
		Var.ratX[0] = 2920;
		Var.ratX[1] = 3420;
		
		Var.squirrelX = 7920;
		Var.squirrelY = 375;
		
		movement = new Timer();
		movement.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				if(Var.inGame) {
				for (int i = 0; i <= 4; i++) {
					Var.mouseX[i] -= Var.mouseSpeed[i];
					
					if (Var.mouseX[i] <= -100) {
						Var.mouseX[i] = 3200;
					}
				}
				
				for (int i = 0; i <= 1; i++) {
					Var.ratX[i] -= Var.ratSpeed[i];
					
					if (Var.ratX[i] <= -100) {
						Var.ratX[i] = 4700;
						
						Random Y = new Random();
						
						Var.ratY[i] = Y.nextInt(1080);
					}
				}
				
				Var.squirrelX -= Var.squirrelSpeed;
				
				if (Var.squirrelX <= -100) {
					Var.squirrelX = 6700;
					
					Random Y = new Random();
					
					Var.squirrelY = Y.nextInt(1080);
				}
				}
			}
		}, 0, 9);
		
	}

}
