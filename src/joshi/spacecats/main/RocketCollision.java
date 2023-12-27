package joshi.spacecats.main;

import java.util.Timer;
import java.util.TimerTask;

public class RocketCollision {
	
	private PlaySound sound = new PlaySound();
	
	private int temp = 0;
	public static boolean hit = false;

	public RocketCollision() {
		
		Timer collision = new Timer();
		
		sound.load();
		
		collision.schedule(new TimerTask() {
			
			@Override
			public void run() {
				
				for (int i = 0; i <= 4; i++) {
					
					if (temp == 0) {
						if (Var.x >= Var.rocketX[i] - 150 && Var.x <= Var.rocketX[i] + 200 && Var.y >= Var.rocketY[i] - 100 && Var.y <= Var.rocketY[i] + 0 ) {
							
							Var.collisioned = true;
							
							if (Var.health >= 1) {
								
								sound.play(PlaySound.hurt);
								
								Var.health--;
								
								hit = true;
								
								collision.schedule(new TimerTask() {
									
									@Override
									public void run() {
										hit = false;
									}
								}, 100);
							}
							
							if (Var.health == 0) {
								Var.loosed = true;
								Var.inGame = false;
							} else if (Var.health > 0) {
								Var.loosed = false;

								Var.rocketX[i] = 2020;
							}
							
							temp++;
						}
					}
				}
				
				if (temp >= 1 && temp <= 65) {
					temp++;
				} else if (temp == 66) {
					temp = 0;
				}
			}
		}, 0, 15);
	}
}
