package joshi.spacecats.main;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class FoodCollision {

	Timer collision;
	
	private PlaySound sound = new PlaySound();
	
	public FoodCollision() {

		sound.load();
		
		collision = new Timer();
		collision.schedule(new TimerTask() {
			
			@Override
			public void run() {
				
				//Mouse
				for (int i = 0; i <= 4; i++) {
					
					if (Var.x >= Var.mouseX[i] - 220 && Var.x <= Var.mouseX[i] + 0 && Var.y >= Var.mouseY[i] - 50 && Var.y <= Var.mouseY[i] - 0) {
						
						sound.play(PlaySound.coin);
						
						Var.food++;
						Var.mouseX[i] = 3200;
						
					}
					
				}
				
				//Rat
				for (int i = 0; i <= 4; i++) {
					
					if (Var.x >= Var.ratX[i] - 220 && Var.x <= Var.ratX[i] + 0 && Var.y >= Var.ratY[i] - 50 && Var.y <= Var.ratY[i] + 0) {
						
						sound.play(PlaySound.coin);
						
						Var.food += 3;
						Var.ratX[i] = 4700;
						
						Random Y = new Random();
						
						Var.ratY[i] = Y.nextInt(1080);
						
					}
					
				}
				
				//Squirrel
				if (Var.x >= Var.squirrelX - 220 && Var.x <= Var.squirrelX + 0 && Var.y >= Var.squirrelY - 50 && Var.y <= Var.squirrelY + 0) {
					
					sound.play(PlaySound.coin);
					
					Var.food += 5;
					Var.squirrelX = 6700;
					
					Random Y = new Random();
					
					Var.squirrelY = Y.nextInt(1080);
					
				}
			}
		}, 0, 15);
	}
}
